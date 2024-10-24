---
title: BlockCopy()
second_title: Aspose.Slides for C++ API Reference
description: Copies a specified number of bytes from source buffer to destination buffer.
type: docs
weight: 1
url: /cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Copies a specified number of bytes from source buffer to destination buffer.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| src | const **uint8_t** * | Pointer to the source buffer |
| srcOffset | int | A byte offset in source buffer at which copying starts |
| dst | **uint8_t** * | Pointer to the destination buffer |
| dstOffset | int | A byte offset in the destination buffer at which to start inserting data |
| count | int | The number of bytes to copy |

## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| TSrc | The type of elements of the source array |
| TDst | The type of elements of the destination array |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| src | const [SharedPtr](../../sharedptr/)\<[Array](../../array/)\<TSrc\>\>\& | The source array |
| srcOffset | int | A byte offset in the tho source array at which copying starts |
| dst | const [SharedPtr](../../sharedptr/)\<[Array](../../array/)\<TDst\>\>\& | The destination array |
| dstOffset | int | A byte offset in the destination array at which to start inserting data |
| count | int | The number of bytes to copy |

## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| TSrc | The type of elements of the source array view |
| TDst | The type of elements of the destination array view |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | The source array view |
| srcOffset | int | A byte offset in the tho source array view at which copying starts |
| dst | const System::Details::ArrayView\<TDst\>\& | The destination array view |
| dstOffset | int | A byte offset in the destination array view at which to start inserting data |
| count | int | The number of bytes to copy |

## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| TSrc | The type of elements of the source array |
| TDst | The type of elements of the destination array view |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| src | const [SharedPtr](../../sharedptr/)\<[Array](../../array/)\<TSrc\>\>\& | The source array |
| srcOffset | int | A byte offset in the tho source array at which copying starts |
| dst | const System::Details::ArrayView\<TDst\>\& | The destination array view |
| dstOffset | int | A byte offset in the destination array view at which to start inserting data |
| count | int | The number of bytes to copy |

## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| TSrc | The type of elements of the source array view |
| TDst | The type of elements of the destination array |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | The source array view |
| srcOffset | int | A byte offset in the tho source array view at which copying starts |
| dst | const [SharedPtr](../../sharedptr/)\<[Array](../../array/)\<TDst\>\>\& | The destination array |
| dstOffset | int | A byte offset in the destination array at which to start inserting data |
| count | int | The number of bytes to copy |

## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| TSrc | The type of elements of the source stack array |
| NS | The size of the source stack array |
| TDst | The type of elements of the destination stack array |
| ND | The size of the destination stack array |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | The source stack array |
| srcOffset | int | A byte offset in the tho source stack array at which copying starts |
| dst | const System::Details::StackArray\<TDst, ND\>\& | The destination stack array |
| dstOffset | int | A byte offset in the destination stack array at which to start inserting data |
| count | int | The number of bytes to copy |

## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| TSrc | The type of elements of the source array |
| TDst | The type of elements of the destination stack array |
| ND | The size of the destination stack array |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| src | const [SharedPtr](../../sharedptr/)\<[Array](../../array/)\<TSrc\>\>\& | The source array |
| srcOffset | int | A byte offset in the tho source array at which copying starts |
| dst | const System::Details::StackArray\<TDst, ND\>\& | The destination stack array |
| dstOffset | int | A byte offset in the destination stack array at which to start inserting data |
| count | int | The number of bytes to copy |

## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


### Template parameters

| Parameter | Description |
| --- | --- |
| TSrc | The type of elements of the source stack array |
| NS | The size of the source stack array |
| TDst | The type of elements of the destination array |

### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | The source stack array |
| srcOffset | int | A byte offset in the tho source stack array at which copying starts |
| dst | const [SharedPtr](../../sharedptr/)\<[Array](../../array/)\<TDst\>\>\& | The destination array |
| dstOffset | int | A byte offset in the destination array at which to start inserting data |
| count | int | The number of bytes to copy |

## See Also

* Typedef [SharedPtr](../../sharedptr/)
* Class [Buffer](../)
* Class [Array](../../array/)
* Namespace [System](../../)
* Library [Aspose.Slides](../../../)