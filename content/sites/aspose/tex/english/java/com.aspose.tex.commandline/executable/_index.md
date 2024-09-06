---
title: Executable
second_title: Aspose.TeX for Java API Reference
description: The base class for classes that emulate the behavior of OS executables which can be run by the occurrences of Object TeXs write18 primitive.
type: docs
weight: 11
url: /java/com.aspose.tex.commandline/executable/
---
**Inheritance:**
java.lang.Object
```
public abstract class Executable
```

The base class for classes that emulate the behavior of OS executables, which can be run by the occurrences of Object TeX's \\write18 primitive.
## Constructors

| Constructor | Description |
| --- | --- |
| [Executable()](#Executable--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getCommandName()](#getCommandName--) | Returns the name of the executable (command). |
| [execute(String[] args)](#execute-java.lang.String---) | The method implementing the executable's behavior. |
### Executable() {#Executable--}
```
public Executable()
```


### getCommandName() {#getCommandName--}
```
public abstract String getCommandName()
```


Returns the name of the executable (command).

**Returns:**
java.lang.String - The name of the executable (command).
### execute(String[] args) {#execute-java.lang.String---}
```
public abstract void execute(String[] args)
```


The method implementing the executable's behavior.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| args | java.lang.String[] | The array of command line arguments. |

