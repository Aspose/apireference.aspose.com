---
title: IFileTerminal
second_title: Aspose.TeX for Java API Reference
description: Interface of terminals which actually are files.
type: docs
weight: 43
url: /java/com.aspose.tex/ifileterminal/
---```
public interface IFileTerminal
```

Interface of terminals which actually are files.
## Methods

| Method | Description |
| --- | --- |
| [getFileName()](#getFileName--) | Gets the file name. |
| [setFileName(String value)](#setFileName-java.lang.String-) | Sets the file name. |
| [writeFile()](#writeFile--) | Finalizes the log, e.g., writes it to file. |
### getFileName() {#getFileName--}
```
public abstract String getFileName()
```


Gets the file name.

**Returns:**
java.lang.String - The file name.
### setFileName(String value) {#setFileName-java.lang.String-}
```
public abstract void setFileName(String value)
```


Sets the file name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The file name. |

### writeFile() {#writeFile--}
```
public abstract void writeFile()
```


Finalizes the log, e.g., writes it to file.

