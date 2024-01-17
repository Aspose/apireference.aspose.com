---
title: PrinterSettings
second_title: Aspose.Drawing for Java API Reference
description: Specifies information about how a document is printed including the printer that prints it when printing from a Windows Forms application .
type: docs
weight: 16
url: /java/com.aspose.drawing.printing/printersettings/
---
**Inheritance:**
java.lang.Object
```
public class PrinterSettings
```

Specifies information about how a document is printed, including the printer that prints it, when printing from a Windows Forms application .
## Constructors

| Constructor | Description |
| --- | --- |
| [PrinterSettings()](#PrinterSettings--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getFromPage()](#getFromPage--) | Gets the page number of the first page to print. |
| [getPrintRange()](#getPrintRange--) | Gets the page numbers that the user has specified to be printed. |
| [getToPage()](#getToPage--) | Gets the number of the last page to print. |
| [getPrinterName()](#getPrinterName--) | Gets the name of the printer to use. |
| [setPrinterName(String value)](#setPrinterName-java.lang.String-) | Sets the name of the printer to use. |
### PrinterSettings() {#PrinterSettings--}
```
public PrinterSettings()
```


### getFromPage() {#getFromPage--}
```
public static int getFromPage()
```


Gets the page number of the first page to print.

**Returns:**
int - The page number of the first page to print.
### getPrintRange() {#getPrintRange--}
```
public static int getPrintRange()
```


Gets the page numbers that the user has specified to be printed.

**Returns:**
int - One of the `PrintRange`([.getPrintRange](../../null/\#getPrintRange)) values.
### getToPage() {#getToPage--}
```
public static int getToPage()
```


Gets the number of the last page to print.

**Returns:**
int - The number of the last page to print.
### getPrinterName() {#getPrinterName--}
```
public final String getPrinterName()
```


Gets the name of the printer to use.

**Returns:**
java.lang.String - The name of the printer to use.
### setPrinterName(String value) {#setPrinterName-java.lang.String-}
```
public final void setPrinterName(String value)
```


Sets the name of the printer to use.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | the name of the printer to use. |

