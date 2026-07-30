---
title: "System::OperatingSystem 类"
linktitle: "OperatingSystem"
second_title: "Aspose.Font 适用于 C++"
description: "System::OperatingSystem 类。表示特定的操作系统并提供其相关信息。此类的对象只能使用 System::MakeObject() 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 5100
url: /zh/cpp/system/operatingsystem/
---
## OperatingSystem class


表示特定的操作系统并提供其相关信息。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class OperatingSystem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Platform](./get_platform/)() const | 返回当前对象所表示的操作系统的平台标识符。 |
| [get_ServicePack](./get_servicepack/)() const | 返回当前对象所表示的操作系统的服务包名称。 |
| [get_Version](./get_version/)() const | 返回一个对 [Version](../version/) 对象的常量引用，该对象表示当前对象所代表的操作系统的版本。 |
| [get_VersionString](./get_versionstring/)() const | 返回由当前对象表示的操作系统版本的字符串表示形式。 |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | 构造一个实例，该实例表示指定的特定平台 ID 和版本的操作系统。 |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | 构造一个实例，该实例表示指定的特定平台 ID、版本和服务包的操作系统。 |
| [ToString](./tostring/)() const | 返回由当前对象表示的操作系统版本的字符串表示形式。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
