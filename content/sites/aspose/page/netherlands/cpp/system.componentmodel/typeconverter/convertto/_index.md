---
title: "System::ComponentModel::TypeConverter::ConvertTo method"
linktitle: "ConvertTo"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::TypeConverter::ConvertTo method. Converteert een object naar een specifiek type in C++."
type: docs
weight: 500
url: /nl/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converteert object naar een specifiek type.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) conversiecontextinformatie. |
| cultuur | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Cultuur die gebruikt moet worden bij het converteren van objecten. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) om te converteren. |
| destinationType | const System::TypeInfo\& | Type om naar te converteren. |

### ReturnValue

Geconverteerd object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converteert object naar een specifiek type.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) om te converteren. |
| destinationType | const System::TypeInfo\& | Type om naar te converteren. |

### ReturnValue

Geconverteerd object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
