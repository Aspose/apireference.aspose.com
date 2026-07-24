---
title: "System::Security::Cryptography::CryptoStream::CryptoStream コンストラクタ"
linktitle: "CryptoStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::CryptoStream::CryptoStream コンストラクタ。C++ のコンストラクタです。"
type: docs
weight: 100
url: /ja/cpp/system.security.cryptography/cryptostream/cryptostream/
---
## CryptoStream::CryptoStream constructor


コンストラクタ。

```cpp
System::Security::Cryptography::CryptoStream::CryptoStream(const SharedPtr<System::IO::Stream> &stream, const SharedPtr<ICryptoTransform> &transform, CryptoStreamMode mode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<System::IO::Stream\>\& | ラップするストリーム。 |
| transform | const SharedPtr\<ICryptoTransform\>\& | ストリームへの送信/読み取り時にデータを処理する変換関数。 |
| mode | CryptoStreamMode | ストリームの方向。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [ICryptoTransform](../../icryptotransform/)
* Enum [CryptoStreamMode](../../cryptostreammode/)
* Class [CryptoStream](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
