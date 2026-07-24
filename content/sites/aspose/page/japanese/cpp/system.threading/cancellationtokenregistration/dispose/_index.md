---
title: "System::Threading::CancellationTokenRegistration::Dispose メソッド"
linktitle: "Dispose"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::CancellationTokenRegistration::Dispose メソッド。登録を破棄し、関連付けられた CancellationTokenSource からコールバックを削除します。このメソッドを呼び出した後、関連する CancellationTokenSource が C++ でキャンセルされても、登録されたコールバックは呼び出されなくなります。"
type: docs
weight: 100
url: /ja/cpp/system.threading/cancellationtokenregistration/dispose/
---
## CancellationTokenRegistration::Dispose method


登録を破棄し、関連付けられた [CancellationTokenSource](../../cancellationtokensource/) からコールバックを削除します。このメソッドを呼び出した後、関連する [CancellationTokenSource](../../cancellationtokensource/) がキャンセルされても、登録されたコールバックは呼び出されなくなります。

```cpp
void System::Threading::CancellationTokenRegistration::Dispose()
```

## 備考



このメソッドを複数回呼び出しても安全です。以降の呼び出しは何の影響も与えません。

## 参照

* Class [CancellationTokenRegistration](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
