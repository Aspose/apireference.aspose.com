---
title: "System::TypeInfo sınıfı"
linktitle: "TypeInfo"
second_title: "Aspose.Page için C++"
description: "System::TypeInfo sınıfı. C++'ta belirli bir tipi temsil eder ve onun hakkında bilgi sağlar."
type: docs
weight: 6600
url: /tr/cpp/system/typeinfo/
---
## TypeInfo class


Belirli bir türü temsil eder ve onun hakkında bilgi sağlar.

```cpp
class TypeInfo
```

## Nested classes

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Belirtilen özniteliği tipin öznitelikler listesine ekler. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | T tipinin varsayılan yapıcısını ayarlar. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Sınıf örneği oluşturan fonktör aracılığıyla varsayılan yapıcıyı ayarlar. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Belirtilen üyeyi tipin üyeler listesine ekler. |
| static [BoxedValueType](./boxedvaluetype/)() | Birden fazla Boxed* sınıfı tarafından paylaşılacak [BoxedValue](./boxedvalue/) tipi için benzersiz bir [TypeInfo](./) yapısı sağlar. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | UYGULANMADI. Geçerli nesne tarafından temsil edilen tipin tanımlandığı derlemeye bir işaretçi döndürür. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | UYGULANMADI. Geçerli nesne tarafından temsil edilen tipin derleme adı dahil tam nitelikli adını döndürür. |
| [get_BaseType](./get_basetype/)() const | Temel tip tanımlayıcısını döndürür. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Geçerli Type nesnesinin, belirli tiplerle değiştirilmemiş tip parametrelerine sahip olup olmadığını gösteren bir değeri alır. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Belirtilen ada sahip üyelerin listesini alır. |
| [get_FullName](./get_fullname/)() const | Geçerli nesne tarafından temsil edilen tipin tam nitelikli adını (ancak derleme adı olmadan) döndürür. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Bu tip için genel tip argümanlarının bir dizisini alır. |
| [get_IsAbstract](./get_isabstract/)() const | Tipin soyut olup olmadığını ve geçersiz kılınması gerektiğini gösteren bir değeri alır. |
| [get_IsArray](./get_isarray/)() const | Tipin bir dizi olup olmadığını gösteren bir değeri alır. |
| [get_IsClass](./get_isclass/)() const | Tipin bir sınıf ya da temsilci olup olmadığını gösteren bir değeri alır; yani bir değer tipi ya da arayüz değildir. |
| [get_IsEnum](./get_isenum/)() const | Geçerli Tipin bir enum (enumeration) temsil edip etmediğini gösteren bir değeri alır. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Geçerli Tipin, diğer genel tiplerin oluşturulabileceği bir genel tip tanımı olup olmadığını gösteren bir değeri alır. |
| [get_IsInterface](./get_isinterface/)() const | Tipin bir arayüz olup olmadığını gösteren bir değeri alır; yani bir sınıf ya da değer tipi değildir. |
| [get_IsSealed](./get_issealed/)() const | Tipin sealed (kapalı) olarak bildirildiğini gösteren bir değeri alır. |
| [get_IsValueType](./get_isvaluetype/)() const | Tipin bir değer tipi olup olmadığını gösteren bir değeri alır. |
| [get_IsVisible](./get_isvisible/)() const | Tipin derleme dışındaki kod tarafından erişilip erişilemeyeceğini gösteren bir değeri alır. |
| [get_Name](./get_name/)() const | Geçerli nesne tarafından temsil edilen tipin adını döndürür. |
| [get_Namespace](./get_namespace/)() const | Tipin ad alanını (namespace) alır. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Belirtilen dizi içindeki tiplerle eşleşen parametrelere sahip bir public örnek yapıcıyı arar. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | belirtilen BindingFlags kullanılarak geçerli Tip için tanımlanan yapıcıları arar. |
| [GetConstructors](./getconstructors/)() const | Geçerli Tip için tanımlanan tüm public yapıcıları döndürür. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Belirtilen tipe sahip ve geçerli nesne tarafından temsil edilen tipe uygulanmış özel özniteliği arar. |
| [GetCustomAttributes](./getcustomattributes/)() const | Tipe uygulanan tüm özel öznitelikleri temsil eden nesneleri içeren bir dizi döndürür. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Tipe uygulanan belirli öznitelikleri temsil eden nesneleri içeren bir dizi döndürür. |
| [GetElementType](./getelementtype/)() const | UYGULANMADI. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Belirtilen bağlama kısıtlamalarını kullanarak belirtilen alanı arar. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Belirtilen bağlama kısıtlamalarını kullanarak geçerli Tip için tanımlanan alanları arar. |
| [GetGenericArguments](./getgenericarguments/)() const | Bu tip için genel tip argümanlarının bir dizisini alır. |
| [GetHashCode](./gethashcode/)() const | Bu örnek ile ilişkili bir hash kodu döndürür. |
| [GetInterfaces](./getinterfaces/)() const | Geçerli Tip tarafından uygulanmış veya miras alınmış tüm arayüzleri alır. |
| [GetMember](./getmember/)(const String\&) const | Belirtilen ada sahip üyelerin listesini alır. |
| [GetMethod](./getmethod/)(const String\&) const | Belirtilen ada sahip yöntemi alır. |
| [GetProperties](./getproperties/)() const | Geçerli Tipin tüm public özelliklerini döndürür. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Belirtilen bağlama kısıtlamalarını kullanarak geçerli Tipin özelliklerini arar. |
| [GetTemplParamType](./gettemplparamtype/)() const | Şablon parametresi tip tanımlayıcısını alır. |
| [Hash](./hash/)() const | Geçerli nesne tarafından temsil edilen tip ile ilişkili bir karma (hash) değeri döndürür. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Belirtilen tipin bir örneğinin geçerli tipin değişkenine atanıp atanamayacağını belirler. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | UYGULANMADI. Belirtilen tipin veya türetilmiş tiplerinin bir veya daha fazla özniteliğinin bu üyeye uygulanıp uygulanmadığını gösterir. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Belirtilen nesnenin geçerli tipin bir örneği olup olmadığını belirler. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Geçerli nesne tarafından temsil edilen tipin belirtilen sınıfın bir alt sınıfı olup olmadığını belirler. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Geçerli ve belirtilen [TypeInfo](./) nesnelerinin eşit olmamasını belirler. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Geçerli [TypeInfo](./) nesnesinin null-nesne olmadığını, yani bir tip temsil ettiğini belirler. |
| [operator==](./operator==/)(const TypeInfo\&) const | Geçerli ve belirtilen [TypeInfo](./) nesnelerinin eşit olup olmadığını belirler. |
| [operator==](./operator==/)(std::nullptr_t) const | Geçerli [TypeInfo](./) nesnesinin null-nesne olup olmadığını, yani hiçbir tip temsil etmediğini belirler. |
| [reset](./reset/)() | [TypeInfo](./) nesnesini null olarak ayarlar. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Tipin değer tipi olup olmadığını gösteren bir değeri ayarlar. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Temel tip tanımlayıcısını ayarlar. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Şablon parametresi tip tanımlayıcısını ayarlar. |
| static [StringHash](./stringhash/)(const char_t *) | Belirtilen dize için karma (hash) hesaplar. |
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
* Library [Aspose.Page for C++](../../)
