---
title: IOutputWorkingDirectory class
second_title: Aspose.TeX for Python via .NET API Reference
description: 
type: docs
weight: 60
url: /python-net/aspose.tex.io/ioutputworkingdirectory/
---

## IOutputWorkingDirectory class

Interface of generalized output working directory.



The IOutputWorkingDirectory type exposes the following members:
## Methods
| Name | Description |
| :- | :- |
| `get_output_file(file_name)` | Returns the stream to write to. MUST NOT return a null object.<br/>            In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead. |
| `get_file(file_name, search_subdirectories)` | Returns the stream to read from. MUST NOT return a null object.<br/>            In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead. |

### See Also

* module [`aspose.tex.io`](/tex/python-net/aspose.tex.io/)
* package [`aspose.tex`](/tex/python-net/)

