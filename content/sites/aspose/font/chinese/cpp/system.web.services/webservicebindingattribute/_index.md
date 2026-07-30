---
title: "System::Web::Services::WebServiceBindingAttribute class"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::WebServiceBindingAttribute 类。用于声明一个绑定，该绑定定义一个或多个 XML Web 服务的方法。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 400
url: /zh/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


用于声明一个绑定，该绑定定义一个或多个 XML [Web](../../system.web/) 服务的方法。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | 获取 WSI 规范。 |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | 获取指示绑定是否发出合规声明的值。 |
| [get_Location](./get_location/)() | RTTI 信息。 |
| [get_Name](./get_name/)() | 获取绑定的名称。 |
| [get_Namespace](./get_namespace/)() | 获取与绑定关联的命名空间。 |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | 设置 WSI 规范。 |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | 设置指示绑定是否发出合规声明的值。 |
| [set_Location](./set_location/)(String) | 设置定义绑定的位置。 |
| [set_Name](./set_name/)(String) | 设置绑定的名称。 |
| [set_Namespace](./set_namespace/)(String) | 设置与绑定关联的命名空间。 |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | 构造一个新实例。 |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | 构造一个新实例。 |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | 构造一个新实例。 |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | 构造一个新实例。 |
## 另见

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Font for C++](../../)
