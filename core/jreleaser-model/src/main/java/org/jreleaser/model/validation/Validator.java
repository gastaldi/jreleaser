/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2021 Andres Almiray.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jreleaser.model.validation;

import org.jreleaser.model.CommitAuthor;
import org.jreleaser.model.CommitAuthorProvider;
import org.jreleaser.model.Environment;
import org.jreleaser.model.OwnerProvider;
import org.jreleaser.util.Env;

import java.util.ArrayList;
import java.util.List;

import static org.jreleaser.util.StringUtils.isBlank;
import static org.jreleaser.util.StringUtils.isNotBlank;

/**
 * @author Andres Almiray
 * @since 0.1.0
 */
class Validator {
    static String checkProperty(Environment environment, String key, String property, String value, List<String> errors) {
        if (isNotBlank(value)) return value;
        return Env.check(key, environment.getVariable(key), property, errors);
    }

    static String checkProperty(Environment environment, String key, String property, String value, String defaultValue) {
        if (isNotBlank(value)) return value;
        List<String> errors = new ArrayList<>();
        String result = Env.check(key, environment.getVariable(key), property, errors);
        return errors.isEmpty() ? result : defaultValue;
    }

    static void validateOwner(OwnerProvider self, OwnerProvider other) {
        if (isBlank(self.getOwner())) self.setOwner(other.getOwner());
    }

    static void validateCommitAuthor(CommitAuthorProvider self, CommitAuthorProvider other) {
        CommitAuthor author = new CommitAuthor();
        author.setName(self.getCommitAuthor().getName());
        author.setEmail(self.getCommitAuthor().getEmail());
        if (isBlank(author.getName())) author.setName(other.getCommitAuthor().getName());
        if (isBlank(author.getEmail())) author.setEmail(other.getCommitAuthor().getEmail());
        self.setCommitAuthor(author);
    }
}
