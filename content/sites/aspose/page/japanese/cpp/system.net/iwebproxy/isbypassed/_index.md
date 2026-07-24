---
title: "System::Net::IWebProxy::IsBypassed メソッド"
linktitle: "IsBypassed"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::IWebProxy::IsBypassed メソッド。指定されたホストに対してプロキシを使用すべきでないかを示す値を C++ で返します。"
type: docs
weight: 300
url: /ja/cpp/system.net/iwebproxy/isbypassed/
---
## IWebProxy::IsBypassed method


指定されたホストに対してプロキシを使用すべきでないかを示す値を返します。

```cpp
virtual bool System::Net::IWebProxy::IsBypassed(System::SharedPtr<Uri> host)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | System::SharedPtr\<Uri\> | 確認するホスト URI。 |

### ReturnValue

プロキシサーバーを使用すべきでない場合は true、そうでない場合は false。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [IWebProxy](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
