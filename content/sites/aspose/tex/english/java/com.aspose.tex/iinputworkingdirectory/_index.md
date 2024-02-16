---
title: IInputWorkingDirectory
second_title: Aspose.TeX for Java API Reference
description: Interface of generalized input working directory.
type: docs
weight: 46
url: /java/com.aspose.tex/iinputworkingdirectory/
---```
public interface IInputWorkingDirectory
```

Interface of generalized input working directory.
## Methods

| Method | Description |
| --- | --- |
| [getFile(String fileName, boolean searchSubdirectories)](#getFile-java.lang.String-boolean-) | Returns the stream to read from. |
| [close()](#close--) | Disposes the directory. |
### getFile(String fileName, boolean searchSubdirectories) {#getFile-java.lang.String-boolean-}
```
public abstract TeXInputStream getFile(String fileName, boolean searchSubdirectories)
```


Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return an NamedInputStream object with a null Stream property value instead.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name. |
| searchSubdirectories | boolean | Indicates whether to look for a file in subdirectories. |

**Returns:**
[TeXInputStream](../../com.aspose.tex/texinputstream) - The named stream.
### close() {#close--}
```
public abstract void close()
```


Disposes the directory.

