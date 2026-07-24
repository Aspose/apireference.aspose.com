---
title: "System::Reflection ad alanı"
linktitle: "System::Reflection"
second_title: "Aspose.Page için C++"
description: "C++'ta System::Reflection ad alanını nasıl kullanılır."
type: docs
weight: 4900
url: /tr/cpp/system.reflection/
---



## Sınıflar

| Sınıf | Açıklama |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) sınıfı, derlemeyi tanımlar. Destek sınırlıdır çünkü kurallar C# ile C++ arasında oldukça farklıdır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [AssemblyName](./assemblyname/) | Derleme adını tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Çalışan derlemede tür kaydetmek için tekil nesne. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Çalışan derlemede tür kaydetmek için tekil nesneler için temel tip. |
| [ConstructorInfo](./constructorinfo/) | Yapıcı meta verilerine erişim sağlar. |
| [FieldInfo](./fieldinfo/) | Bir alanın özniteliklerini keşfeder ve alan meta verilerine erişim sağlar. |
| [MemberInfo](./memberinfo/) | Üyeler hakkında yansıma bilgisi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [MethodBase](./methodbase/) | Yöntem hakkında temel bilgi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [MethodInfo](./methodinfo/) | Sınıf yöntemi hakkında bilgiyi temsil eder. |
| [PropertyInfo](./propertyinfo/) | Özellik bilgisini temsil eder. |
## Enums

| Enum | Açıklama |
| --- | --- |
| [BindingFlags](./bindingflags/) | Üyeleri ve tipleri arama modlarını ve bağlamaları tanımlar. |
| [FieldAttributes](./fieldattributes/) | Yansıtılmış alan öznitelikleri. |
| [MemberTypes](./membertypes/) | Her üye tipini işaretler. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) modülün GetTypes yöntemi tarafından, bir modüldeki sınıflardan herhangi biri yüklenemezse fırlatılır. [ReflectionTypeLoadException](./reflectiontypeloadexception/) sınıfı örneklerini [System::SmartPtr](../system/smartptr/) içine asmayın. |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) yansıma yoluyla çağrılan yöntemler tarafından fırlatılır. [TargetInvocationException](./targetinvocationexception/) sınıfı örneklerini [System::SmartPtr](../system/smartptr/) içine asmayın. |
