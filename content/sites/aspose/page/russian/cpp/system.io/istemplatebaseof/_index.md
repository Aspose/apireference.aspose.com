---
title: "System::IO::IsTemplateBaseOf typedef"
linktitle: "IsTemplateBaseOf"
second_title: "Aspose.Page для C++"
description: "System::IO::IsTemplateBaseOf typedef. Представляет собой аналог std::is_base_of<Base, Derived>, определяющий наследование неинстанцированного шаблонного класса Base от инстанцированного шаблонного класса Derived. Не будет работать при множественном наследовании или непубличного наследования от Base в C++."
type: docs
weight: 4100
url: /ru/cpp/system.io/istemplatebaseof/
---
## IsTemplateBaseOf typedef


Представляет аналог std::is_base_of<Base, Derived>, определяющий наследование неинстанцированного шаблонного класса Base от инстанцированного шаблонного класса Derived. Не будет работать при множественном наследовании или наследовании Base с недоступным (non-public) уровнем доступа.

```cpp
using System::Details::IsTemplateBaseOf =  typename IsTemplateBaseOfImpl<Base, Derived>::type
```


## См. также

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
