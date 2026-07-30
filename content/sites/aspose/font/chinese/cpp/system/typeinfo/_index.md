---
title: "System::TypeInfo 类"
linktitle: "TypeInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::TypeInfo 类。表示特定类型并在 C++ 中提供其信息。"
type: docs
weight: 6600
url: /zh/cpp/system/typeinfo/
---
## TypeInfo class


表示特定类型并提供其信息。

```cpp
class TypeInfo
```

## Nested classes

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | 将指定的属性添加到类型属性列表中。 |
| [AddDefaultConstructor](./adddefaultconstructor/)() | 为类型 T 设置默认构造函数。 |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | 通过创建类实例的函数对象设置默认构造函数。 |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | 将指定的成员添加到类型成员列表中。 |
| static [BoxedValueType](./boxedvaluetype/)() | 为 [BoxedValue](./boxedvalue/) 类型提供唯一的 [TypeInfo](./) 结构，以便多个 Boxed* 类共享。 |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | 未实现。返回指向当前对象所表示的类型所在程序集的指针。 |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | 未实现。返回包括程序集名称在内的当前对象所表示的类型的完全限定名。 |
| [get_BaseType](./get_basetype/)() const | 返回基类型描述符。 |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | 获取一个值，指示当前 Type 对象是否具有尚未被具体类型替换的类型参数。 |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | 获取具有指定名称的成员列表。 |
| [get_FullName](./get_fullname/)() const | 返回当前对象所表示的类型的完全限定名（但不包括程序集名称）。 |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | 获取此类型的泛型类型参数数组。 |
| [get_IsAbstract](./get_isabstract/)() const | 获取一个值，指示该 Type 是否为抽象且必须被重写。 |
| [get_IsArray](./get_isarray/)() const | 获取一个值，指示该类型是否为数组。 |
| [get_IsClass](./get_isclass/)() const | 获取一个值，指示该 Type 是类还是委托；即不是值类型或接口。 |
| [get_IsEnum](./get_isenum/)() const | 获取一个值，指示当前 Type 是否表示枚举。 |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | 获取一个值，指示当前 Type 是否表示通用类型定义，可据此构造其他泛型类型。 |
| [get_IsInterface](./get_isinterface/)() const | 获取一个值，指示 Type 是否为接口；即不是类或值类型。 |
| [get_IsSealed](./get_issealed/)() const | 获取一个值，指示 Type 是否被声明为 sealed。 |
| [get_IsValueType](./get_isvaluetype/)() const | 获取一个值，指示 Type 是否为值类型。 |
| [get_IsVisible](./get_isvisible/)() const | 获取一个值，指示 Type 是否可以被程序集外的代码访问。 |
| [get_Name](./get_name/)() const | 返回当前对象所表示的类型的名称。 |
| [get_Namespace](./get_namespace/)() const | 获取 Type 的命名空间。 |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | 搜索具有公共实例构造函数，其参数与指定数组中的类型匹配。 |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | 使用指定的 BindingFlags 搜索当前 Type 定义的构造函数。 |
| [GetConstructors](./getconstructors/)() const | 返回为当前 Type 定义的所有公共构造函数。 |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | 搜索具有指定类型且应用于当前对象所表示的类型的自定义属性。 |
| [GetCustomAttributes](./getcustomattributes/)() const | 返回一个数组，其中包含表示应用于该类型的所有自定义属性的对象。 |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | 返回一个数组，其中包含表示应用于该类型的特定属性的对象。 |
| [GetElementType](./getelementtype/)() const | 未实现。 |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | 使用指定的绑定约束搜索指定的字段。 |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | 使用指定的绑定约束搜索为当前 Type 定义的字段。 |
| [GetGenericArguments](./getgenericarguments/)() const | 获取此类型的泛型类型参数数组。 |
| [GetHashCode](./gethashcode/)() const | 返回与此实例关联的哈希码。 |
| [GetInterfaces](./getinterfaces/)() const | 获取当前 Type 实现或继承的所有接口。 |
| [GetMember](./getmember/)(const String\&) const | 获取具有指定名称的成员列表。 |
| [GetMethod](./getmethod/)(const String\&) const | 获取具有指定名称的方法。 |
| [GetProperties](./getproperties/)() const | 返回当前 Type 的所有公共属性。 |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | 使用指定的绑定约束搜索当前 Type 的属性。 |
| [GetTemplParamType](./gettemplparamtype/)() const | 获取模板参数类型描述符。 |
| [Hash](./hash/)() const | 返回与当前对象所表示的类型关联的哈希值。 |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | 确定指定类型的实例是否可以分配给当前类型的变量。 |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | 未实现。指示是否已将指定类型或其派生类型的一个或多个属性应用于此成员。 |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | 确定指定对象是否是当前类型的实例。 |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | 确定当前对象所表示的类型是否是指定类的子类。 |
| [operator!=](./operator!=/)(const TypeInfo\&) const | 确定当前的和指定的 [TypeInfo](./) 对象是否不相等。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 确定当前的 [TypeInfo](./) 对象是否不是空对象，即它表示某种类型。 |
| [operator==](./operator==/)(const TypeInfo\&) const | 确定当前的和指定的 [TypeInfo](./) 对象是否相等。 |
| [operator==](./operator==/)(std::nullptr_t) const | 确定当前的 [TypeInfo](./) 对象是否为空对象，即不表示任何类型。 |
| [reset](./reset/)() | 将 [TypeInfo](./) 设置为 null。 |
| [set_IsValueType](./set_isvaluetype/)(bool) | 设置一个值，指示该类型是否为值类型。 |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | 设置基类型描述符。 |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | 设置模板参数类型描述符。 |
| static [StringHash](./stringhash/)(const char_t *) | 计算指定字符串的哈希值。 |
| [ToString](./tostring/)() const | 返回一个字符串，包含当前对象所表示的类型名称。 |
| static [Type](./type/)() | 返回一个表示 [TypeInfo](./) 类的 [TypeInfo](./) 对象。 |
| [TypeInfo](./typeinfo/)() | 默认构造函数（未设置类型）。 |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | 空对象构造函数（未设置类型）。 |
| [TypeInfo](./typeinfo/)(const char_t *) | 构造函数。 |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | 构造函数。 |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | 构造函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [EmptyType](./emptytype/) | 表示空的 [TypeInfo](./) 列表的常量。 |
| static [EmptyTypes](./emptytypes/) | 表示空的 [TypeInfo](./) 列表的常量。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | 用于构造类型的函数指针。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
