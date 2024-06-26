/*
 * Copyright 2018-2023 contributors to the Marquez project
 * SPDX-License-Identifier: Apache-2.0
 */

package marquez.db;

import org.jdbi.v3.sqlobject.CreateSqlObject;
import org.jdbi.v3.sqlobject.SqlObject;

public interface BaseDao extends SqlObject {
  @CreateSqlObject
  DatasetDao createDatasetDao();

  @CreateSqlObject
  DatasetFieldDao createDatasetFieldDao();

  @CreateSqlObject
  DatasetVersionDao createDatasetVersionDao();

  @CreateSqlObject
  DatasetSchemaVersionDao createDatasetSchemaVersionDao();

  @CreateSqlObject
  JobDao createJobDao();

  @CreateSqlObject
  JobVersionDao createJobVersionDao();

  @CreateSqlObject
  NamespaceDao createNamespaceDao();

  @CreateSqlObject
  DatasetSymlinkDao createDatasetSymlinkDao();

  @CreateSqlObject
  RunDao createRunDao();

  @CreateSqlObject
  RunArgsDao createRunArgsDao();

  @CreateSqlObject
  RunStateDao createRunStateDao();

  @CreateSqlObject
  SourceDao createSourceDao();

  @CreateSqlObject
  TagDao createTagDao();

  @CreateSqlObject
  StreamVersionDao createStreamVersionDao();

  @CreateSqlObject
  OpenLineageDao createOpenLineageDao();

  @CreateSqlObject
  ColumnLineageDao createColumnLineageDao();

  @CreateSqlObject
  DatasetFacetsDao createDatasetFacetsDao();

  @CreateSqlObject
  JobFacetsDao createJobFacetsDao();

  @CreateSqlObject
  RunFacetsDao createRunFacetsDao();
}
