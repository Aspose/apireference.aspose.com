---
title: "BaseReportExporter<P extends com.jaspersoft.jasperserver.api.engine.jasperreports.common.ExportParameters>"
linktitle: "BaseReportExporter<P extends com.jaspersoft.jasperserver.api.engine.jasperreports.common.ExportParameters>"
second_title: "Aspose.CAD for JasperReports"
description: "Exports report to the image format."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.common/basereportexporter/
---

**Inheritance:** java.lang.Object, com.jaspersoft.jasperserver.api.engine.jasperreports.common.ExportParameters>

Exports report to the image format.

## Constructors

| Constructor | Description |
| --- | --- |
| [BaseReportExporter()](#BaseReportExporter) |  |

## Methods

| Method | Description |
| --- | --- |
| [export(org.springframework.webflow.execution.RequestContext requestContext) throws IOException, net.sf.jasperreports.engine.JRException](#export-org.springframework.webflow.execution.RequestContext) |  |
| [getExportParameters()](#getExportParameters) | Gets export parameters. |
| [setExportParameters(P exportParameters)](#setExportParameters-P) | Sets export parameters. |
| [getContentType(org.springframework.webflow.execution.RequestContext requestContext)](#getContentType-org.springframework.webflow.execution.RequestContext) | Gets identifier for file formats and format contents transmitted on the Internet. |
| [getExportMode()](#getExportMode) | Gets export mode. |
| [setExportMode(ExportMode exportMode)](#setExportMode-com.aspose.cad.jasperreports.common.ExportMode) | Sets export mode. |
| [getBatchPrefix()](#getBatchPrefix) | Gets batch prefix. |
| [setBatchPrefix(String batchPrefix)](#setBatchPrefix-java.lang.String) | Sets batch prefix. |

### BaseReportExporter() {#BaseReportExporter}
```java
public BaseReportExporter()
```

### export(org.springframework.webflow.execution.RequestContext requestContext) throws IOException, net.sf.jasperreports.engine.JRException {#export-org.springframework.webflow.execution.RequestContext}
```java
public org.springframework.webflow.execution.Event export(org.springframework.webflow.execution.RequestContext requestContext) throws IOException, net.sf.jasperreports.engine.JRException
```

**Returns:** org.springframework.webflow.execution.Event

**Throws:**

- `IOException` - IOException
- `net.sf.jasperreports.engine.JRException` - net.sf.jasperreports.engine.JRException

### getExportParameters() {#getExportParameters}
```java
public P getExportParameters()
```

Gets export parameters.

**Returns:** P - the export parameters

### setExportParameters(P exportParameters) {#setExportParameters-P}
```java
public void setExportParameters(P exportParameters)
```

Sets export parameters.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| exportParameters | P | the export parameters to be set |

### getContentType(org.springframework.webflow.execution.RequestContext requestContext) {#getContentType-org.springframework.webflow.execution.RequestContext}
```java
public String getContentType(org.springframework.webflow.execution.RequestContext requestContext)
```

Gets identifier for file formats and format contents transmitted on the Internet.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| requestContext | org.springframework.webflow.execution.RequestContext | request context |

**Returns:** String - identifier for file formats

### getExportMode() {#getExportMode}
```java
public ExportMode getExportMode()
```

Gets export mode.

**Returns:** ExportMode - the export mode

### setExportMode(ExportMode exportMode) {#setExportMode-com.aspose.cad.jasperreports.common.ExportMode}
```java
public void setExportMode(ExportMode exportMode)
```

Sets export mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| exportMode | ExportMode | the export mode |

### getBatchPrefix() {#getBatchPrefix}
```java
public String getBatchPrefix()
```

Gets batch prefix.

**Returns:** String - the batch prefix

### setBatchPrefix(String batchPrefix) {#setBatchPrefix-java.lang.String}
```java
public void setBatchPrefix(String batchPrefix)
```

Sets batch prefix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| batchPrefix | String | the batch prefix |

