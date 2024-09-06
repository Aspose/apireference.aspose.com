---
title: IOutputWorkingDirectory
second_title: Aspose.TeX for Java API Reference
description: Interface of generalized output working directory.
type: docs
weight: 46
url: /java/com.aspose.tex/ioutputworkingdirectory/
---
**All Implemented Interfaces:**
[com.aspose.tex.IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory)
```
public interface IOutputWorkingDirectory extends IInputWorkingDirectory
```

Interface of generalized output working directory.
## Methods

| Method | Description |
| --- | --- |
| [getOutputFile(String fileName)](#getOutputFile-java.lang.String-) | Returns the stream to write to. |
### getOutputFile(String fileName) {#getOutputFile-java.lang.String-}
```
public abstract TeXOutputStream getOutputFile(String fileName)
```


Returns the stream to write to. MUST NOT return null. In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name. |

**Returns:**
[TeXOutputStream](../../com.aspose.tex/texoutputstream) - The named TeX output stream.
