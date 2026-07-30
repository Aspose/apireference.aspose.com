---
title: "Metodo System::ComponentModel::TypeConverter::ConvertTo"
linktitle: "ConvertTo"
second_title: "Aspose.Font per C++"
description: "Metodo System::ComponentModel::TypeConverter::ConvertTo. Converte l'oggetto in un tipo specifico in C++."
type: docs
weight: 500
url: /it/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converte l'oggetto in un tipo specifico.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) informazioni sul contesto di conversione. |
| cultura | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Culture da utilizzare durante la conversione degli oggetti. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) da convertire. |
| destinationType | const System::TypeInfo\& | Tipo in cui convertire. |

### ReturnValue

Oggetto convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converte l'oggetto in un tipo specifico.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) da convertire. |
| destinationType | const System::TypeInfo\& | Tipo in cui convertire. |

### ReturnValue

Oggetto convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
