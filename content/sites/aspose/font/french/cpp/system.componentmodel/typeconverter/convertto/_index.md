---
title: "System::ComponentModel::TypeConverter::ConvertTo méthode"
linktitle: "ConvertTo"
second_title: "Aspose.Font pour C++"
description: "System::ComponentModel::TypeConverter::ConvertTo méthode. Convertit un objet en type spécifique en C++."
type: docs
weight: 500
url: /fr/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Convertit un objet en type spécifique.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) information de contexte de conversion. |
| culture | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Culture à utiliser lors de la conversion d'objets. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) à convertir. |
| destinationType | const System::TypeInfo\& | Type vers lequel convertir. |

### ReturnValue

Objet converti.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Convertit un objet en type spécifique.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) à convertir. |
| destinationType | const System::TypeInfo\& | Type vers lequel convertir. |

### ReturnValue

Objet converti.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
