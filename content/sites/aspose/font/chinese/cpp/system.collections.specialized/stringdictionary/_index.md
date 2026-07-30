---
title: "System::Collections::Specialized::StringDictionary 类"
linktitle: "StringDictionary"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Specialized::StringDictionary 类。字符串到字符串的字典。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 500
url: /zh/cpp/system.collections.specialized/stringdictionary/
---
## StringDictionary class


[String](../../system/string/) to string dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class StringDictionary : public System::Collections::Generic::Dictionary<String, String>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const override | 获取特定键的值。 |
## 另见

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
