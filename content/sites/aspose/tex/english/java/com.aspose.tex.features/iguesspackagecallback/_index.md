---
title: IGuessPackageCallback
second_title: Aspose.TeX for Java API Reference
description: Defines the interface for an external method to guess a required LaTeX package by command name.
type: docs
weight: 12
url: /java/com.aspose.tex.features/iguesspackagecallback/
---```
public interface IGuessPackageCallback
```

Defines the interface for an external method to guess a required LaTeX package by command name.
## Methods

| Method | Description |
| --- | --- |
| [guessPackage(String commandName, boolean isEnvironment)](#guessPackage-java.lang.String-boolean-) | Returns the name of a required package that supposedly defines the command or environment. |
### guessPackage(String commandName, boolean isEnvironment) {#guessPackage-java.lang.String-boolean-}
```
public abstract String guessPackage(String commandName, boolean isEnvironment)
```


Returns the name of a required package that supposedly defines the command or environment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| commandName | java.lang.String | The command or environment name. |
| isEnvironment | boolean | Specifies whether to guess a package for a command or an environment. |

**Returns:**
java.lang.String - The package name.
