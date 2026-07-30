---
title: "System::IConvertible::ToType méthode"
linktitle: "ToType"
second_title: "Aspose.Font pour C++"
description: "System::IConvertible::ToType méthode. Convertit la valeur de cette instance en un System::Object du System::Type spécifié qui possède une valeur équivalente, en utilisant les informations de formatage spécifiques à la culture spécifiées en C++."
type: docs
weight: 1400
url: /fr/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Convertit la valeur de cette instance en un [System::Object](../../object/) du System::Type spécifié qui possède une valeur équivalente, en utilisant les informations de formatage spécifiques à la culture spécifiées.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| conversionType | const TypeInfo\& | Le System::Type vers lequel la valeur de cette instance est convertie. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Une implémentation de l'interface [System::IFormatProvider](../../iformatprovider/) qui fournit des informations de formatage spécifiques à la culture. |

### ReturnValue

Une instance [System::Object](../../object/) de type conversionType dont la valeur est équivalente à la valeur de cette instance.

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
