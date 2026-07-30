---
title: "Метод System::ComponentModel::TypeConverter::ConvertFrom"
linktitle: "ConvertFrom"
second_title: "Aspose.Font для C++"
description: "Метод System::ComponentModel::TypeConverter::ConvertFrom. Преобразует объекты в C++."
type: docs
weight: 200
url: /ru/cpp/system.componentmodel/typeconverter/convertfrom/
---
## TypeConverter::ConvertFrom(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) method


Преобразует объекты.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertFrom(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) информация о контексте преобразования. |
| культура | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Культура, используемая при преобразовании объектов. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) для преобразования. |

### ReturnValue

преобразованный объект.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## TypeConverter::ConvertFrom(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) method


Преобразует строку в объект.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertFrom(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::String &value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) информация о контексте преобразования. |
| культура | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Культура, используемая при преобразовании объектов. |
| значение | const System::String\& | Значение для преобразования. |

### ReturnValue

преобразованный объект.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../../../system/string/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## TypeConverter::ConvertFrom(const System::SharedPtr\<System::Object\>\&) method


Преобразует объекты.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertFrom(const System::SharedPtr<System::Object> &value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) для преобразования. |

### ReturnValue

преобразованный объект.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
