---
title: "System::PrintTo メソッド"
linktitle: "PrintTo"
second_title: "C++ 用 Aspose.Page"
description: "System::PrintTo メソッド。指定されたオブジェクトが表す値を、C++ の指定された出力ストリームに書き込みます。"
type: docs
weight: 35300
url: /ja/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


指定されたオブジェクトが表す値を、指定された出力ストリームに書き込みます。

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| d | const Decimal\& | ストリームに出力する [Decimal](../decimal/) オブジェクト |
| os | ::std::ostream * | 指定されたオブジェクトを出力するストリーム |

## 参照

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## 参照

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## 参照

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## 参照

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


文字列を ostream に出力します。主にデバッグで使用されます。

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const System::String\& | 出力するために。 |
| os | std::ostream * | 対象の ostream。 |

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## 参照

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## 参照

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## 参照

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


値を ostream に出力します。主にデバッグで使用されます。

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## 参照

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
