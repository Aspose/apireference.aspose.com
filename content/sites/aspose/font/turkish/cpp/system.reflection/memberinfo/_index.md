---
title: "System::Reflection::MemberInfo class"
linktitle: "MemberInfo"
second_title: "Aspose.Font için C++"
description: "System::Reflection::MemberInfo sınıfı. Üyeler hakkında yansıma bilgisi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Üyeler hakkında yansıma bilgisi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılararak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Koleksiyona öznitelik ekler. |
| [get_DeclaringType](./get_declaringtype/)() const | İlan eden türü alır. |
| [get_FullName](./get_fullname/)() const | Üye tam adını alır. Manuel olarak uygulanmış bölümlerde farklı olabilir. |
| virtual [get_MemberType](./get_membertype/)() const | Üyenin türünü gösteren bir [System::Reflection::MemberTypes](../membertypes/) değeri alır - yöntem, yapıcı, olay vb. |
| [get_Name](./get_name/)() const | Üye adını alır. |
| [get_ReflectedType](./get_reflectedtype/)() const | Yansıtılan tipin türünü alır. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Geçerli nesne tarafından temsil edilen türe uygulanan tüm özel öznitelikleri temsil eden nesneleri içeren bir dizi döndürür. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Geçerli nesne tarafından temsil edilen türe uygulanan tüm özel öznitelikleri temsil eden nesneleri içeren bir dizi döndürür. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ObjectPtr](./objectptr/) | [Object](../../system/object/) için paylaşımlı gösterici takma adı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
