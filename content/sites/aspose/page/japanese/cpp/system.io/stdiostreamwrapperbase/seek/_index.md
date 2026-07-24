---
title: "System::IO::STDIOStreamWrapperBase::Seek メソッド"
linktitle: "Seek"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::STDIOStreamWrapperBase::Seek メソッド。C++で現在のオブジェクトが表すストリームの位置を設定します。"
type: docs
weight: 800
url: /ja/cpp/system.io/stdiostreamwrapperbase/seek/
---
## STDIOStreamWrapperBase::Seek method


現在のオブジェクトが表すストリームの位置を設定します。

```cpp
virtual int64_t System::IO::STDIOStreamWrapperBase<T, typename>::Seek(int64_t offset, SeekOrigin origin) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| offset | int64_t | **origin** で指定された位置を基準としたバイトオフセットです。 |
| origin | SeekOrigin | オフセットが計算される基準位置と方向を指定します。 |

### ReturnValue

ストリームの新しい位置です。

## 参照

* Enum [SeekOrigin](../../seekorigin/)
* Class [STDIOStreamWrapperBase](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
