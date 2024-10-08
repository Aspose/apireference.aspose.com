---
title: GetByteCount()
second_title: Aspose.Slides for C++ API Reference
description: Get the number of characters needed to encode a character buffer.
type: docs
weight: 235
url: /cpp/system.text/encoding/getbytecount/
---
## Encoding::GetByteCount(ArrayPtr\<char_t\>, int, int) method


Get the number of characters needed to encode a character buffer.

```cpp
virtual int System::Text::Encoding::GetByteCount(ArrayPtr<char_t> chars, int index, int count)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| chars | [ArrayPtr](../../../system/arrayptr/)\<char_t\> | Characters buffer. |
| index | int | Slice begin. |
| count | int | Slice size. |

### Return Value

Required buffer size.

## Encoding::GetByteCount(System::Details::ArrayView\<char_t\>, int, int) method


Get the number of characters needed to encode a character buffer.

```cpp
virtual int System::Text::Encoding::GetByteCount(System::Details::ArrayView<char_t> chars, int index, int count)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | Characters buffer. |
| index | int | Slice begin. |
| count | int | Slice size. |

### Return Value

Required buffer size.

## Encoding::GetByteCount(const System::Details::StackArray\<char_t, N\>\&, int, int) method


Get the number of characters needed to encode a character buffer.

```cpp
template<std::size_t> int System::Text::Encoding::GetByteCount(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | Characters buffer. |
| index | int | Slice begin. |
| count | int | Slice size. |

### Return Value

Required buffer size.

## Encoding::GetByteCount(const String\&) method


Get the number of characters needed to encode a string.

```cpp
virtual int System::Text::Encoding::GetByteCount(const String &s)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| s | const [String](../../../system/string/)\& | [String](../../../system/string/) to encode. |

### Return Value

Required buffer size.

## Encoding::GetByteCount(ArrayPtr\<char_t\>) method


Get the number of characters needed to encode a character buffer.

```cpp
virtual int System::Text::Encoding::GetByteCount(ArrayPtr<char_t> chars)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| chars | [ArrayPtr](../../../system/arrayptr/)\<char_t\> | Characters buffer. |

### Return Value

Required buffer size.

## Encoding::GetByteCount(const char_t *, int) method


Get the number of characters needed to encode a character buffer.

```cpp
virtual int System::Text::Encoding::GetByteCount(const char_t *chars, int count)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| chars | const char_t * | Characters buffer. |
| count | int | [Buffer](../../../system/buffer/) size. |

### Return Value

Required buffer size.

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Class [String](../../../system/string/)
* Namespace [System::Text](../../)
* Library [Aspose.Slides](../../../)