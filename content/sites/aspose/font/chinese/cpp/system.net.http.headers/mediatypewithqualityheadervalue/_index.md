---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue 类"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue 类。表示在 ''Content-Type'' 头部值中具有附加质量因子的 MIME 类型。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1300
url: /zh/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


表示在 'Content-Type' 头部值中具有附加质量因子的 MIME 类型。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI 信息。 |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | 构造一个新实例。 |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | 构造一个新实例。 |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | 构造一个新实例。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [MediaTypeWithQualityHeaderValue](./) 类的实例。 |
| [set_Quality](./set_quality/)(Nullable\<double\>) | 设置质量值。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | 尝试将传入的字符串转换为 [MediaTypeWithQualityHeaderValue](./) 类的实例。 |
## 另见

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
