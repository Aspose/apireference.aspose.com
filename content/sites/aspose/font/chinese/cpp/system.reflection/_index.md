---
title: "System::Reflection 命名空间"
linktitle: "System::Reflection"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Reflection 命名空间。"
type: docs
weight: 5300
url: /zh/cpp/system.reflection/
---



## 类

| 类 | 描述 |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) 类描述程序集。由于 C# 与 C++ 的规则差异很大，支持有限。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [AssemblyName](./assemblyname/) | 定义程序集名称。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | 用于在执行程序集注册类型的单例。 |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | 用于在执行程序集注册类型的单例基类。 |
| [ConstructorInfo](./constructorinfo/) | 提供对构造函数元数据的访问。 |
| [FieldInfo](./fieldinfo/) | 发现字段的属性并提供对字段元数据的访问。 |
| [MemberInfo](./memberinfo/) | 提供成员的反射信息。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [MethodBase](./methodbase/) | 方法的基本信息。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [MethodInfo](./methodinfo/) | 表示类方法的信息。 |
| [PropertyInfo](./propertyinfo/) | 表示属性信息。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [BindingFlags](./bindingflags/) | 定义成员和类型的查找模式及绑定方式。 |
| [FieldAttributes](./fieldattributes/) | 反射字段属性。 |
| [MemberTypes](./membertypes/) | 标记每种成员类型。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) 在 Module.GetTypes 方法中如果模块中的任何类加载失败时抛出。切勿将 [ReflectionTypeLoadException](./reflectiontypeloadexception/) 类实例包装进 [System::SmartPtr](../system/smartptr/)。 |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) 在通过反射调用的方法中抛出。切勿将 [TargetInvocationException](./targetinvocationexception/) 类实例包装进 [System::SmartPtr](../system/smartptr/)。 |
