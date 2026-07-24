---
title: "System::Net::WebRequest::RegisterPrefix メソッド"
linktitle: "RegisterPrefix"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebRequest::RegisterPrefix メソッド。C++ で指定された URI に対して WebRequest の派生クラスを登録します。"
type: docs
weight: 600
url: /ja/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


指定された URI に対して [WebRequest](../) の派生クラスを登録します。

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | String | URI または URI プレフィックス。 |
| creator | System::SharedPtr\<IWebRequestCreate\> | 新しい [WebRequest](../) クラスのインスタンスを作成します。 |

### ReturnValue

指定された URI に対して [WebRequest](../) の派生クラスが正常に登録された場合は true、そうでない場合は false です。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
