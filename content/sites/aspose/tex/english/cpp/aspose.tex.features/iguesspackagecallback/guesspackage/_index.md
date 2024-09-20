---
title: Aspose::TeX::Features::IGuessPackageCallback::GuessPackage method
linktitle: GuessPackage
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Features::IGuessPackageCallback::GuessPackage method. Returns the name of a required package that supposedly defines the command or environment in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex.features/iguesspackagecallback/guesspackage/
---
## IGuessPackageCallback::GuessPackage method


Returns the name of a required package that supposedly defines the command or environment.

```cpp
virtual System::String Aspose::TeX::Features::IGuessPackageCallback::GuessPackage(System::String commandName, bool isEnvironment)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| commandName | System::String | The command name. |
| isEnvironment | bool | Specifies whether to guess a package for a command or an environment. |

### ReturnValue

The package name.

## See Also

* Class [IGuessPackageCallback](../)
* Namespace [Aspose::TeX::Features](../../)
* Library [Aspose.TeX for C++](../../../)
