---
title: "System::IO::STDIOStreamWrapperBase 类"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::STDIOStreamWrapperBase 类。表示一个用于类似 System.IO.Stream 包装器的基类。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 2000
url: /zh/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


表示一个用于类似 [System.IO.Stream](../stream/) 包装器的基类。此类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | 确定流是否支持读取。 |
| [get_CanSeek](./get_canseek/)() const override | 确定流是否支持定位。 |
| [get_CanWrite](./get_canwrite/)() const override | 确定流是否支持写入。 |
| [get_Length](./get_length/)() const override | 返回流的长度。 |
| [get_Position](./get_position/)() const override | 返回流的当前位置。 |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | 拷贝赋值运算符。已删除。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 设置当前对象所表示的流的位置。 |
| [set_Position](./set_position/)(int64_t) override | 设置流的位置。 |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | 拷贝构造函数。已删除。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../stream/null/) | 一个没有底层存储的流。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI 信息。 |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## 另见

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
