---
title: ExecutablesList
second_title: Aspose.TeX for Java API Reference
description: Encapsulates a collection of objects that emulate executables which can be executed using the write18 commands in ObjectTeX.
type: docs
weight: 12
url: /java/com.aspose.tex.commandline/executableslist/
---
**Inheritance:**
java.lang.Object
```
public class ExecutablesList
```

Encapsulates a collection of objects that emulate executables, which can be executed using the  \\write18  commands in ObjectTeX.
## Constructors

| Constructor | Description |
| --- | --- |
| [ExecutablesList()](#ExecutablesList--) |  |
## Methods

| Method | Description |
| --- | --- |
| [add(Executable exec)](#add-com.aspose.tex.commandline.Executable-) | Adds a new executable to the collection. |
| [remove(String commandName)](#remove-java.lang.String-) | Removes an executable by its name. |
| [getList()](#getList--) | Displays the collection as a read-only list of executables' names. |
### ExecutablesList() {#ExecutablesList--}
```
public ExecutablesList()
```


### add(Executable exec) {#add-com.aspose.tex.commandline.Executable-}
```
public void add(Executable exec)
```


Adds a new executable to the collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| exec | [Executable](../../com.aspose.tex.commandline/executable) | An instance of  Executable 's subclass. |

### remove(String commandName) {#remove-java.lang.String-}
```
public void remove(String commandName)
```


Removes an executable by its name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| commandName | java.lang.String | The name of an executable. |

### getList() {#getList--}
```
public Set<String> getList()
```


Displays the collection as a read-only list of executables' names.

**Returns:**
java.util.Set<java.lang.String> - The collection as a read-only list of executables' names.
