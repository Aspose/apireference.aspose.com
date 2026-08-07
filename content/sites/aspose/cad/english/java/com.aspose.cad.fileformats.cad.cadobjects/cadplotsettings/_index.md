---
title: "CadPlotSettings"
linktitle: "CadPlotSettings"
second_title: "Aspose.CAD for Java"
description: "The Cad Plot Settings object."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadplotsettings/
---

**Inheritance:** java.lang.Object, CadBaseObject

The Cad Plot Settings object.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadPlotSettings()](#CadPlotSettings) | Initializes a new instance of the CadPlotSettings class. |

## Methods

| Method | Description |
| --- | --- |
| [getShadePlotHandle()](#getShadePlotHandle) | Gets or sets the shade plot handle. |
| [setShadePlotHandle(String value)](#setShadePlotHandle-java.lang.String) | Gets or sets the shade plot handle. |
| [getPaperImageOrigin()](#getPaperImageOrigin) | Gets or sets the paper image origin. |
| [setPaperImageOrigin(Cad2DPoint value)](#setPaperImageOrigin-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the paper image origin. |
| [getStandardScaleTypeFactor()](#getStandardScaleTypeFactor) | Gets or sets the standard scale type factor. |
| [setStandardScaleTypeFactor(double value)](#setStandardScaleTypeFactor-double) | Gets or sets the standard scale type factor. |
| [getShadePlotCustomDpi()](#getShadePlotCustomDpi) | Gets or sets the shade plot custom dpi. |
| [setShadePlotCustomDpi(short value)](#setShadePlotCustomDpi-short) | Gets or sets the shade plot custom dpi. |
| [getShadePlotResolutionLevel()](#getShadePlotResolutionLevel) | Gets or sets the shade plot resolution level. |
| [setShadePlotResolutionLevel(short value)](#setShadePlotResolutionLevel-short) | Gets or sets the shade plot resolution level. |
| [getShadePlotMode()](#getShadePlotMode) | Gets or sets the shade plot mode. |
| [setShadePlotMode(short value)](#setShadePlotMode-short) | Gets or sets the shade plot mode. |
| [getStandardScaleType()](#getStandardScaleType) | Gets or sets the type of the standard scale. |
| [setStandardScaleType(short value)](#setStandardScaleType-short) | Gets or sets the type of the standard scale. |
| [getCurrentStyleSheet()](#getCurrentStyleSheet) | Gets or sets the current style sheet. |
| [setCurrentStyleSheet(String value)](#setCurrentStyleSheet-java.lang.String) | Gets or sets the current style sheet. |
| [getPlotType()](#getPlotType) | Gets or sets the type of the plot. |
| [setPlotType(short value)](#setPlotType-short) | Gets or sets the type of the plot. |
| [getPlotRotation()](#getPlotRotation) | Gets or sets the plot rotation. |
| [setPlotRotation(short value)](#setPlotRotation-short) | Gets or sets the plot rotation. |
| [getPlotPaperUnits()](#getPlotPaperUnits) | Gets or sets the plot paper units. |
| [setPlotPaperUnits(short value)](#setPlotPaperUnits-short) | Gets or sets the plot paper units. |
| [getPlotLayoutFlag()](#getPlotLayoutFlag) | Gets or sets the plot layout flag. |
| [setPlotLayoutFlag(short value)](#setPlotLayoutFlag-short) | Gets or sets the plot layout flag. |
| [getCustomPrintScaleDenominator()](#getCustomPrintScaleDenominator) | Gets or sets the custom print scale denominator. |
| [setCustomPrintScaleDenominator(double value)](#setCustomPrintScaleDenominator-double) | Gets or sets the custom print scale denominator. |
| [getCustomPrintScaleNumerator()](#getCustomPrintScaleNumerator) | Gets or sets the custom print scale numerator. |
| [setCustomPrintScaleNumerator(double value)](#setCustomPrintScaleNumerator-double) | Gets or sets the custom print scale numerator. |
| [getPlotWindowArea2()](#getPlotWindowArea2) | Gets or sets the plot window area2. |
| [setPlotWindowArea2(Cad2DPoint value)](#setPlotWindowArea2-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the plot window area2. |
| [getPlotWindowArea1()](#getPlotWindowArea1) | Gets or sets the plot window area1. |
| [setPlotWindowArea1(Cad2DPoint value)](#setPlotWindowArea1-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the plot window area1. |
| [getPlotOrigin()](#getPlotOrigin) | Gets or sets the plot origin. |
| [setPlotOrigin(Cad2DPoint value)](#setPlotOrigin-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the plot origin. |
| [getPlotPaperSize()](#getPlotPaperSize) | Gets or sets the size of the plot paper. |
| [setPlotPaperSize(CadSize value)](#setPlotPaperSize-com.aspose.cad.fileformats.cad.cadobjects.CadSize) | Gets or sets the size of the plot paper. |
| [getTopSize()](#getTopSize) | Gets or sets the size of the top. |
| [setTopSize(double value)](#setTopSize-double) | Gets or sets the size of the top. |
| [getRightSideSize()](#getRightSideSize) | Gets or sets the size of the right side. |
| [setRightSideSize(double value)](#setRightSideSize-double) | Gets or sets the size of the right side. |
| [getBottomSize()](#getBottomSize) | Gets or sets the size of the bottom. |
| [setBottomSize(double value)](#setBottomSize-double) | Gets or sets the size of the bottom. |
| [getLeftSideSize()](#getLeftSideSize) | Gets or sets the size of the left side. |
| [setLeftSideSize(double value)](#setLeftSideSize-double) | Gets or sets the size of the left side. |
| [getPlotViewName()](#getPlotViewName) | Gets or sets the name of the plot view. |
| [setPlotViewName(String value)](#setPlotViewName-java.lang.String) | Gets or sets the name of the plot view. |
| [getPaperSize()](#getPaperSize) | Gets or sets the size of the paper. |
| [setPaperSize(String value)](#setPaperSize-java.lang.String) | Gets or sets the size of the paper. |
| [getPrinterOrConfigurationFileName()](#getPrinterOrConfigurationFileName) | Gets or sets the name of the printer or configuration file. |
| [setPrinterOrConfigurationFileName(String value)](#setPrinterOrConfigurationFileName-java.lang.String) | Gets or sets the name of the printer or configuration file. |
| [getPageSetupName()](#getPageSetupName) | Gets or sets the name of the page setup. |
| [setPageSetupName(String value)](#setPageSetupName-java.lang.String) | Gets or sets the name of the page setup. |

### CadPlotSettings() {#CadPlotSettings}
```java
public CadPlotSettings()
```

Initializes a new instance of the CadPlotSettings class.

### getShadePlotHandle() {#getShadePlotHandle}
```java
public final String getShadePlotHandle()
```

Gets or sets the shade plot handle.

**Returns:** String - The shade plot handle.

### setShadePlotHandle(String value) {#setShadePlotHandle-java.lang.String}
```java
public final void setShadePlotHandle(String value)
```

Gets or sets the shade plot handle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The shade plot handle. |

### getPaperImageOrigin() {#getPaperImageOrigin}
```java
public final Cad2DPoint getPaperImageOrigin()
```

Gets or sets the paper image origin.

**Returns:** Cad2DPoint - The paper image origin.

### setPaperImageOrigin(Cad2DPoint value) {#setPaperImageOrigin-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setPaperImageOrigin(Cad2DPoint value)
```

Gets or sets the paper image origin.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The paper image origin. |

### getStandardScaleTypeFactor() {#getStandardScaleTypeFactor}
```java
public final double getStandardScaleTypeFactor()
```

Gets or sets the standard scale type factor.

**Returns:** double - The standard scale type factor.

### setStandardScaleTypeFactor(double value) {#setStandardScaleTypeFactor-double}
```java
public final void setStandardScaleTypeFactor(double value)
```

Gets or sets the standard scale type factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The standard scale type factor. |

### getShadePlotCustomDpi() {#getShadePlotCustomDpi}
```java
public final short getShadePlotCustomDpi()
```

Gets or sets the shade plot custom dpi.

**Returns:** short - The shade plot custom dpi.

### setShadePlotCustomDpi(short value) {#setShadePlotCustomDpi-short}
```java
public final void setShadePlotCustomDpi(short value)
```

Gets or sets the shade plot custom dpi.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The shade plot custom dpi. |

### getShadePlotResolutionLevel() {#getShadePlotResolutionLevel}
```java
public final short getShadePlotResolutionLevel()
```

Gets or sets the shade plot resolution level.

**Returns:** short - The shade plot resolution level.

### setShadePlotResolutionLevel(short value) {#setShadePlotResolutionLevel-short}
```java
public final void setShadePlotResolutionLevel(short value)
```

Gets or sets the shade plot resolution level.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The shade plot resolution level. |

### getShadePlotMode() {#getShadePlotMode}
```java
public final short getShadePlotMode()
```

Gets or sets the shade plot mode.

**Returns:** short - The shade plot mode.

### setShadePlotMode(short value) {#setShadePlotMode-short}
```java
public final void setShadePlotMode(short value)
```

Gets or sets the shade plot mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The shade plot mode. |

### getStandardScaleType() {#getStandardScaleType}
```java
public final short getStandardScaleType()
```

Gets or sets the type of the standard scale.

**Returns:** short - The type of the standard scale.

### setStandardScaleType(short value) {#setStandardScaleType-short}
```java
public final void setStandardScaleType(short value)
```

Gets or sets the type of the standard scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the standard scale. |

### getCurrentStyleSheet() {#getCurrentStyleSheet}
```java
public final String getCurrentStyleSheet()
```

Gets or sets the current style sheet.

**Returns:** String - The current style sheet.

### setCurrentStyleSheet(String value) {#setCurrentStyleSheet-java.lang.String}
```java
public final void setCurrentStyleSheet(String value)
```

Gets or sets the current style sheet.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The current style sheet. |

### getPlotType() {#getPlotType}
```java
public final short getPlotType()
```

Gets or sets the type of the plot.

**Returns:** short - The type of the plot.

### setPlotType(short value) {#setPlotType-short}
```java
public final void setPlotType(short value)
```

Gets or sets the type of the plot.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the plot. |

### getPlotRotation() {#getPlotRotation}
```java
public final short getPlotRotation()
```

Gets or sets the plot rotation.

**Returns:** short - The plot rotation.

### setPlotRotation(short value) {#setPlotRotation-short}
```java
public final void setPlotRotation(short value)
```

Gets or sets the plot rotation.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The plot rotation. |

### getPlotPaperUnits() {#getPlotPaperUnits}
```java
public final short getPlotPaperUnits()
```

Gets or sets the plot paper units.

**Returns:** short - The plot paper units.

### setPlotPaperUnits(short value) {#setPlotPaperUnits-short}
```java
public final void setPlotPaperUnits(short value)
```

Gets or sets the plot paper units.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The plot paper units. |

### getPlotLayoutFlag() {#getPlotLayoutFlag}
```java
public final short getPlotLayoutFlag()
```

Gets or sets the plot layout flag.

**Returns:** short - The plot layout flag.

### setPlotLayoutFlag(short value) {#setPlotLayoutFlag-short}
```java
public final void setPlotLayoutFlag(short value)
```

Gets or sets the plot layout flag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The plot layout flag. |

### getCustomPrintScaleDenominator() {#getCustomPrintScaleDenominator}
```java
public final double getCustomPrintScaleDenominator()
```

Gets or sets the custom print scale denominator.

**Returns:** double - The custom print scale denominator.

### setCustomPrintScaleDenominator(double value) {#setCustomPrintScaleDenominator-double}
```java
public final void setCustomPrintScaleDenominator(double value)
```

Gets or sets the custom print scale denominator.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The custom print scale denominator. |

### getCustomPrintScaleNumerator() {#getCustomPrintScaleNumerator}
```java
public final double getCustomPrintScaleNumerator()
```

Gets or sets the custom print scale numerator.

**Returns:** double - The custom print scale numerator.

### setCustomPrintScaleNumerator(double value) {#setCustomPrintScaleNumerator-double}
```java
public final void setCustomPrintScaleNumerator(double value)
```

Gets or sets the custom print scale numerator.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The custom print scale numerator. |

### getPlotWindowArea2() {#getPlotWindowArea2}
```java
public final Cad2DPoint getPlotWindowArea2()
```

Gets or sets the plot window area2.

**Returns:** Cad2DPoint - The plot window area2.

### setPlotWindowArea2(Cad2DPoint value) {#setPlotWindowArea2-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setPlotWindowArea2(Cad2DPoint value)
```

Gets or sets the plot window area2.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The plot window area2. |

### getPlotWindowArea1() {#getPlotWindowArea1}
```java
public final Cad2DPoint getPlotWindowArea1()
```

Gets or sets the plot window area1.

**Returns:** Cad2DPoint - The plot window area1.

### setPlotWindowArea1(Cad2DPoint value) {#setPlotWindowArea1-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setPlotWindowArea1(Cad2DPoint value)
```

Gets or sets the plot window area1.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The plot window area1. |

### getPlotOrigin() {#getPlotOrigin}
```java
public final Cad2DPoint getPlotOrigin()
```

Gets or sets the plot origin.

**Returns:** Cad2DPoint - The plot origin.

### setPlotOrigin(Cad2DPoint value) {#setPlotOrigin-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setPlotOrigin(Cad2DPoint value)
```

Gets or sets the plot origin.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The plot origin. |

### getPlotPaperSize() {#getPlotPaperSize}
```java
public final CadSize getPlotPaperSize()
```

Gets or sets the size of the plot paper.

**Returns:** CadSize - The size of the plot paper.

### setPlotPaperSize(CadSize value) {#setPlotPaperSize-com.aspose.cad.fileformats.cad.cadobjects.CadSize}
```java
public final void setPlotPaperSize(CadSize value)
```

Gets or sets the size of the plot paper.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadSize | The size of the plot paper. |

### getTopSize() {#getTopSize}
```java
public final double getTopSize()
```

Gets or sets the size of the top.

**Returns:** double - The size of the top.

### setTopSize(double value) {#setTopSize-double}
```java
public final void setTopSize(double value)
```

Gets or sets the size of the top.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The size of the top. |

### getRightSideSize() {#getRightSideSize}
```java
public final double getRightSideSize()
```

Gets or sets the size of the right side.

**Returns:** double - The size of the right side.

### setRightSideSize(double value) {#setRightSideSize-double}
```java
public final void setRightSideSize(double value)
```

Gets or sets the size of the right side.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The size of the right side. |

### getBottomSize() {#getBottomSize}
```java
public final double getBottomSize()
```

Gets or sets the size of the bottom.

**Returns:** double - The size of the bottom.

### setBottomSize(double value) {#setBottomSize-double}
```java
public final void setBottomSize(double value)
```

Gets or sets the size of the bottom.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The size of the bottom. |

### getLeftSideSize() {#getLeftSideSize}
```java
public final double getLeftSideSize()
```

Gets or sets the size of the left side.

**Returns:** double - The size of the left side.

### setLeftSideSize(double value) {#setLeftSideSize-double}
```java
public final void setLeftSideSize(double value)
```

Gets or sets the size of the left side.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The size of the left side. |

### getPlotViewName() {#getPlotViewName}
```java
public final String getPlotViewName()
```

Gets or sets the name of the plot view.

**Returns:** String - The name of the plot view.

### setPlotViewName(String value) {#setPlotViewName-java.lang.String}
```java
public final void setPlotViewName(String value)
```

Gets or sets the name of the plot view.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the plot view. |

### getPaperSize() {#getPaperSize}
```java
public final String getPaperSize()
```

Gets or sets the size of the paper.

**Returns:** String - The size of the paper.

### setPaperSize(String value) {#setPaperSize-java.lang.String}
```java
public final void setPaperSize(String value)
```

Gets or sets the size of the paper.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The size of the paper. |

### getPrinterOrConfigurationFileName() {#getPrinterOrConfigurationFileName}
```java
public final String getPrinterOrConfigurationFileName()
```

Gets or sets the name of the printer or configuration file.

**Returns:** String - The name of the printer or configuration file.

### setPrinterOrConfigurationFileName(String value) {#setPrinterOrConfigurationFileName-java.lang.String}
```java
public final void setPrinterOrConfigurationFileName(String value)
```

Gets or sets the name of the printer or configuration file.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the printer or configuration file. |

### getPageSetupName() {#getPageSetupName}
```java
public final String getPageSetupName()
```

Gets or sets the name of the page setup.

**Returns:** String - The name of the page setup.

### setPageSetupName(String value) {#setPageSetupName-java.lang.String}
```java
public final void setPageSetupName(String value)
```

Gets or sets the name of the page setup.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the page setup. |

