---
title: "System::DateTimeOffset::operator- メソッド"
linktitle: "operator-"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTimeOffset::operator- メソッド。現在のオブジェクトと指定されたオブジェクトが表す日付と時刻の値間の時間間隔を表す TimeSpan クラスのインスタンスを C++ で返します。"
type: docs
weight: 3500
url: /ja/cpp/system/datetimeoffset/operator-/
---
## DateTimeOffset::operator-(const DateTimeOffset\&) const method


現在のオブジェクトと指定されたオブジェクトが表す日付と時刻の値間の時間間隔を表す [TimeSpan](../../timespan/) クラスのインスタンスを返します。

```cpp
TimeSpan System::DateTimeOffset::operator-(const DateTimeOffset &other) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| other | const DateTimeOffset\& | 計算される区間の一端を示す [DateTime](../../datetime/) クラスのインスタンス |

### ReturnValue

現在のオブジェクトと **other** が表す日付と時刻の値間の時間間隔を表す [TimeSpan](../../timespan/) クラスのインスタンス

## 参照

* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::operator-(TimeSpan) const method


現在のオブジェクトが表す値から指定された時間間隔を減算した結果となる日付と時刻の値を表す [DateTimeOffset](../) クラスの新しいインスタンスを返します。

```cpp
DateTimeOffset System::DateTimeOffset::operator-(TimeSpan value) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | TimeSpan | 減算する時間間隔 |

### ReturnValue

現在のオブジェクトが表す値から **value** を減算した結果となる日付と時刻の値を表す [DateTimeOffset](../) クラスの新しいインスタンス

## 参照

* Class [DateTimeOffset](../)
* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
