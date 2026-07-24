---
title: "Κλάση System::Reflection::PropertyInfo"
linktitle: "PropertyInfo"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Reflection::PropertyInfo. Αντιπροσωπεύει πληροφορίες ιδιότητας σε C++."
type: docs
weight: 1000
url: /el/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


Αναπαριστά πληροφορίες ιδιότητας.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Λαμβάνει μια τιμή [MemberTypes](../membertypes/) που υποδεικνύει ότι αυτό το μέλος είναι ιδιότητα. |
| [get_PropertyType](./get_propertytype/)() | Λαμβάνει τον τύπο της ιδιότητας. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | Λαμβάνει την τιμή της ιδιότητας από συγκεκριμένο αντικείμενο. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Λαμβάνει την τιμή της ιδιότητας από συγκεκριμένο αντικείμενο. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Κατασκευαστής. Ιδιότητα με μόνο const getter. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | Κατασκευαστής. Ιδιότητα με μόνο non-const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Κατασκευαστής. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | Κατασκευαστής. Ιδιότητα [Nullable](../../system/nullable/) με setter και getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | Κατασκευαστής. Ιδιότητα [Nullable](../../system/nullable/) με μόνο const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | Κατασκευαστής. Ιδιότητα [Object](../../system/object/) με μόνο getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | Δημιουργεί πληροφορίες ιδιότητας τύπου string. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | Δημιουργεί πληροφορίες ιδιότητας τύπου string από κλάση με const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | Δημιουργεί πληροφορίες ιδιότητας [Decimal](../../system/decimal/). |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | Δημιουργεί πληροφορίες ιδιότητας [Decimal](../../system/decimal/) από κλάση με const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | Δημιουργεί πληροφορίες ιδιότητας boolean. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | Δημιουργεί πληροφορίες ιδιότητας boolean από κλάση με const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | Δημιουργεί πληροφορίες ιδιότητας int64_t. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | Δημιουργεί πληροφορίες ιδιότητας int64_t από κλάση με const getter. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | Ορίζει τον τύπο αυτής της ιδιότητας. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | Ορίζει την τιμή της ιδιότητας σε συγκεκριμένο αντικείμενο. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Ορίζει την τιμή της ιδιότητας σε συγκεκριμένο αντικείμενο. |
## Δείτε επίσης

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
