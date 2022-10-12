---
title: IOutputWorkingDirectory
second_title: Aspose.TeX for Java API Reference
description: Interface of generalized output working directory.
type: docs
weight: 39
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
| [getOutputFile(String fileName, String[] fullName)](#getOutputFile-java.lang.String-java.lang.String---) | Returns the stream to write to. |
### getOutputFile(String fileName, String[] fullName) {#getOutputFile-java.lang.String-java.lang.String---}
```
public abstract OutputStream getOutputFile(String fileName, String[] fullName)
```


Returns the stream to write to.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name. |
| fullName | java.lang.String[] | The full file name. |

**Returns:**
java.io.OutputStream - The stream.
