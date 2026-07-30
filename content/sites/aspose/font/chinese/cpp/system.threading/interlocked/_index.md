---
title: "System::Threading::Interlocked 类"
linktitle: "Interlocked"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Interlocked 类。提供线程安全操作的 API。这是一个没有实例服务的静态类型。绝不应以任何方式在 C++ 中创建其实例。"
type: docs
weight: 600
url: /zh/cpp/system.threading/interlocked/
---
## Interlocked class


提供线程安全操作的 API。这是一个没有实例服务的静态类型。无论何种方式都不应创建其实例。

```cpp
class Interlocked
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | 原子递增值。 |
| static [Add](./add/)(int64_t\&, int64_t) | 原子递增值。 |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | 比较交换变量的值：检查变量是否等于特定值，仅在已存储的值匹配预期时才存储新值。 |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | 比较交换变量的值：检查变量是否等于特定值，仅在已存储的值匹配预期时才存储新值。未实现。 |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | 比较交换变量的值：检查变量是否等于特定值，仅在已存储的值匹配预期时才存储新值。 |
| static [Decrement](./decrement/)(int32_t\&) | 原子递减值。 |
| static [Decrement](./decrement/)(int64_t\&) | 原子递减值。 |
| static [Exchange](./exchange/)(T\&, T) | 交换变量的值：存储新值并返回存储前变量原有的值。 |
| static [Exchange](./exchange/)(T\&, T) | 交换变量的值：存储新值并返回存储前变量原有的值。未实现。 |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | 通过 exchange-add 过程原子递增值。 |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | 通过 exchange-add 过程原子递增值。 |
| static [Increment](./increment/)(int32_t\&) | 原子递增值。 |
| static [Increment](./increment/)(int64_t\&) | 原子递增值。 |
| static [Read](./read/)(int64_t\&) | 返回一个 64 位值，以原子操作加载。 |
## 另见

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
