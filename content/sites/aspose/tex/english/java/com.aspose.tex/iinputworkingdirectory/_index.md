---
title: IInputWorkingDirectory
second_title: Aspose.TeX for Java API Reference
description: Interface of generalized input working directory.
type: docs
weight: 44
url: /java/com.aspose.tex/iinputworkingdirectory/
---```
public interface IInputWorkingDirectory
```

Interface of generalized input working directory.
## Methods

| Method | Description |
| --- | --- |
| [getFile(String fileName, String[] fullName, boolean searchSubdirectories)](#getFile-java.lang.String-java.lang.String---boolean-) | Returns the stream to read from. |
| [close()](#close--) | Disposes the directory. |
### getFile(String fileName, String[] fullName, boolean searchSubdirectories) {#getFile-java.lang.String-java.lang.String---boolean-}
```
public abstract TeXInputStream getFile(String fileName, String[] fullName, boolean searchSubdirectories)
```


Returns the stream to read from.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name. |
| fullName | java.lang.String[] | The full file name. |
| searchSubdirectories | boolean | Indicates whether to look for a file in subdirectories. |

**Returns:**
[TeXInputStream](../../com.aspose.tex/texinputstream) - The stream.
### close() {#close--}
```
public abstract void close()
```


Disposes the directory.

