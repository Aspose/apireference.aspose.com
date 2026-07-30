---
title: "System::TypeInfo sınıfı"
linktitle: "TypeInfo"
second_title: "Aspose.Font için C++"
description: "System::TypeInfo sınıfı. C++'da belirli bir türü temsil eder ve onun hakkında bilgi sağlar."
type: docs
weight: 6600
url: /tr/cpp/system/typeinfo/
---
## TypeInfo class


Belirli bir tipi temsil eder ve onun hakkında bilgi sağlar.

```cpp
class TypeInfo
```

## Nested classes

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Belirtilen özniteliği türün öznitelikler listesine ekler. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | T türü için varsayılan yapıcıyı ayarlar. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Sınıf örneği oluşturan fonktör aracılığıyla varsayılan yapıcıyı ayarlar. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Belirtilen üyeyi türün üyeler listesine ekler. |
| static [BoxedValueType](./boxedvaluetype/)() | Birden fazla Boxed* sınıfı tarafından paylaşılacak [BoxedValue](./boxedvalue/) türü için benzersiz bir [TypeInfo](./) yapısı sağlar. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | UYGULANMADI. Geçerli nesne tarafından temsil edilen türün bildirildiği derlemeye bir işaretçi döndürür. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | UYGULANMADI. Geçerli nesne tarafından temsil edilen türün derleme adını da içeren tam nitelikli adını döndürür. |
| [get_BaseType](./get_basetype/)() const | Temel tür tanımlayıcısını döndürür. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Geçerli Type nesnesinin, belirli türler tarafından henüz yerine konulmamış tür parametreleri olup olmadığını gösteren bir değer alır. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Belirtilen ada sahip üyelerin listesini alır. |
| [get_FullName](./get_fullname/)() const | Geçerli nesne tarafından temsil edilen türün (derleme adı olmadan) tam nitelikli adını döndürür. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Bu tür için genel tür bağımsız değişkenlerinin bir dizisini alır. |
| [get_IsAbstract](./get_isabstract/)() const | Türün soyut olup olmadığını ve geçersiz kılınması gerektiğini gösteren bir değer alır. |
| [get_IsArray](./get_isarray/)() const | Türün bir dizi olup olmadığını gösteren bir değer alır. |
| [get_IsClass](./get_isclass/)() const | Türün bir sınıf mı yoksa bir temsilci mi olduğunu gösteren bir değer alır; yani değer türü ya da arabirim değildir. |
| [get_IsEnum](./get_isenum/)() const | Geçerli Type'ın bir enum (sayım) temsil edip etmediğini gösteren bir değer alır. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Geçerli Type'ın, diğer genel tiplerin oluşturulabileceği bir genel tip tanımı temsil edip etmediğini gösteren bir değer alır. |
| [get_IsInterface](./get_isinterface/)() const | Type'ın bir arayüz olup olmadığını gösteren bir değer alır; yani bir sınıf veya değer tipi değildir. |
| [get_IsSealed](./get_issealed/)() const | Type'ın sealed olarak bildirildiğini gösteren bir değer alır. |
| [get_IsValueType](./get_isvaluetype/)() const | Type'ın bir değer tipi olup olmadığını gösteren bir değer alır. |
| [get_IsVisible](./get_isvisible/)() const | Type'ın derlemenin dışındaki kod tarafından erişilebilir olup olmadığını gösteren bir değer alır. |
| [get_Name](./get_name/)() const | Geçerli nesne tarafından temsil edilen tipin adını döndürür. |
| [get_Namespace](./get_namespace/)() const | Type'ın ad alanını alır. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Belirtilen dizi içindeki tiplerle eşleşen parametrelere sahip bir public örnek yapıcıyı arar. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | Belirtilen BindingFlags kullanılarak geçerli Type için tanımlı yapıcıları arar. |
| [GetConstructors](./getconstructors/)() const | Geçerli Type için tanımlı tüm public yapıcıları döndürür. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Belirtilen tipe sahip ve geçerli nesne tarafından temsil edilen tipe uygulanmış özel özniteliği arar. |
| [GetCustomAttributes](./getcustomattributes/)() const | Tipe uygulanan tüm özel öznitelikleri temsil eden nesneleri içeren bir dizi döndürür. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Tipe uygulanan belirli öznitelikleri temsil eden nesneleri içeren bir dizi döndürür. |
| [GetElementType](./getelementtype/)() const | UYGULANMADI. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Belirtilen bağlama kısıtlamalarını kullanarak belirtilen alanı arar. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Belirtilen bağlama kısıtlamalarını kullanarak geçerli Type için tanımlı alanları arar. |
| [GetGenericArguments](./getgenericarguments/)() const | Bu tür için genel tür bağımsız değişkenlerinin bir dizisini alır. |
| [GetHashCode](./gethashcode/)() const | Bu örnek ile ilişkili bir hash kodu döndürür. |
| [GetInterfaces](./getinterfaces/)() const | Geçerli Type tarafından uygulanmış veya miras alınmış tüm arayüzleri alır. |
| [GetMember](./getmember/)(const String\&) const | Belirtilen ada sahip üyelerin listesini alır. |
| [GetMethod](./getmethod/)(const String\&) const | Belirtilen ada sahip yöntemi alır. |
| [GetProperties](./getproperties/)() const | Geçerli Type'ın tüm public özelliklerini döndürür. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Belirtilen bağlama kısıtlamalarını kullanarak geçerli Type'ın özelliklerini arar. |
| [GetTemplParamType](./gettemplparamtype/)() const | Şablon parametresi tip tanımlayıcısını alır. |
| [Hash](./hash/)() const | Geçerli nesne tarafından temsil edilen tip ile ilişkili bir hash değeri döndürür. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Belirtilen tipin bir örneğinin, geçerli tipin bir değişkenine atanıp atanamayacağını belirler. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | UYGULANMADI. Belirtilen tipin veya türetilmiş tiplerinin bir veya daha fazla özniteliğinin bu üye üzerine uygulanıp uygulanmadığını gösterir. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Belirtilen nesnenin geçerli tipin bir örneği olup olmadığını belirler. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Geçerli nesne tarafından temsil edilen tipin belirtilen sınıfın bir alt sınıfı olup olmadığını belirler. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Geçerli ve belirtilen [TypeInfo](./) nesnelerinin eşit olmadığını belirler. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Geçerli [TypeInfo](./) nesnesinin null-nesne olmadığını, yani bir tip temsil ettiğini belirler. |
| [operator==](./operator==/)(const TypeInfo\&) const | Geçerli ve belirtilen [TypeInfo](./) nesnelerinin eşit olup olmadığını belirler. |
| [operator==](./operator==/)(std::nullptr_t) const | Geçerli [TypeInfo](./) nesnesinin null-nesne olduğunu, yani herhangi bir tip temsil etmediğini belirler. |
| [reset](./reset/)() | [TypeInfo](./) nesnesini null olarak ayarlar. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Tipin değer tipi olup olmadığını gösteren bir değeri ayarlar. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Temel tip tanımlayıcısını ayarlar. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Şablon parametresi tip tanımlayıcısını ayarlar. |
| static [StringHash](./stringhash/)(const char_t *) | Belirtilen dize için hash değerini hesaplar. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen tipin adını içeren bir dize döndürür. |
| static [Type](./type/)() | [TypeInfo](./) sınıfını temsil eden bir [TypeInfo](./) nesnesi döndürür. |
| [TypeInfo](./typeinfo/)() | Varsayılan yapıcı (tip ayarlanmamış). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | Null nesne yapıcı (tip ayarlanmamış). |
| [TypeInfo](./typeinfo/)(const char_t *) | Yapıcı. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | Yapıcı. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | Yapıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [EmptyType](./emptytype/) | [TypeInfo](./) boş listesini temsil eden sabit. |
| static [EmptyTypes](./emptytypes/) | [TypeInfo](./) boş listesini temsil eden sabit. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | Tip oluşturmak için fonksiyon işaretçisi. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
