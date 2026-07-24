---
title: "System::IO::IsTemplateBaseOf typedef"
linktitle: "IsTemplateBaseOf"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::IsTemplateBaseOf typedef。std::is_base_of<Base, Derived> の対応物で、インスタンス化されていない Base テンプレートクラスがインスタンス化された Derived テンプレートクラスから継承されているかを判定します。C++ では多重継承や Base からの非公開継承がある場合は失敗します。"
type: docs
weight: 4100
url: /ja/cpp/system.io/istemplatebaseof/
---
## IsTemplateBaseOf typedef


インスタンス化されていない Base テンプレートクラスがインスタンス化された Derived テンプレートクラスから継承されているかを判定する std::is_base_of<Base, Derived> の対応物を表します。多重継承や Base からの非公開継承の場合は失敗します。

```cpp
using System::Details::IsTemplateBaseOf =  typename IsTemplateBaseOfImpl<Base, Derived>::type
```


## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
