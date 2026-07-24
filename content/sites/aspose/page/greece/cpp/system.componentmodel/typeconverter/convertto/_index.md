---
title: "System::ComponentModel::TypeConverter::ConvertTo μέθοδος"
linktitle: "ConvertTo"
second_title: "Aspose.Page για C++"
description: "System::ComponentModel::TypeConverter::ConvertTo μέθοδος. Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο σε C++."
type: docs
weight: 500
url: /el/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) πληροφορίες πλαισίου μετατροπής. |
| πολιτιστική ρύθμιση | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Πολιτισμός για χρήση κατά τη μετατροπή αντικειμένων. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) για μετατροπή. |
| destinationType | const System::TypeInfo\& | Τύπος για μετατροπή σε. |

### ReturnValue

Μετατρεπόμενο αντικείμενο.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) για μετατροπή. |
| destinationType | const System::TypeInfo\& | Τύπος για μετατροπή σε. |

### ReturnValue

Μετατρεπόμενο αντικείμενο.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
