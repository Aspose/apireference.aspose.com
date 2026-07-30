---
title: "System::IO::IsTemplateBaseOf typedef"
linktitle: "IsTemplateBaseOf"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::IsTemplateBaseOf typedef。表示 std::is_base_of<Base, Derived> 的对应实现，用于确定未实例化的 Base 模板类从已实例化的 Derived 模板类的继承关系。在 C++ 中，若出现多重继承或非公共继承自 Base 将导致失败。"
type: docs
weight: 4100
url: /zh/cpp/system.io/istemplatebaseof/
---
## IsTemplateBaseOf typedef


表示 std::is_base_of<Base, Derived> 的对应实现，用于确定未实例化的 Base 模板类是否从已实例化的 Derived 模板类继承。若出现多重继承或非公共继承自 Base 将导致失败。

```cpp
using System::Details::IsTemplateBaseOf =  typename IsTemplateBaseOfImpl<Base, Derived>::type
```


## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
