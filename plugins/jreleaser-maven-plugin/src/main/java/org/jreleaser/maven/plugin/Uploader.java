/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2022 The JReleaser authors.
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
package org.jreleaser.maven.plugin;

/**
 * @author Andres Almiray
 * @since 0.3.0
 */
public interface Uploader extends Activatable, TimeoutAware, ExtraProperties {
    String getName();

    void setName(String name);

    Boolean isArtifacts();

    void setArtifacts(Boolean artifacts);

    boolean isArtifactsSet();

    Boolean isFiles();

    void setFiles(Boolean files);

    boolean isFilesSet();

    Boolean isSignatures();

    void setSignatures(Boolean signatures);

    boolean isSignaturesSet();

    boolean isChecksumsSet();

    Boolean isChecksums();

    void setChecksums(Boolean checksums);
}
