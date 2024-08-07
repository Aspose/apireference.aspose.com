---
title: StreamContainer.Read
second_title: Aspose.Imaging for .NET API Reference
description: StreamContainer method. Reads bytes to fill the specified bytes buffer
type: docs
weight: 110
url: /net/aspose.imaging/streamcontainer/read/
---
## Read(byte[]) {#read}

Reads bytes to fill the specified bytes buffer.

```csharp
public virtual int Read(byte[] bytes)
```

| Parameter | Type | Description |
| --- | --- | --- |
| bytes | Byte[] | The bytes to fill. |

### Return Value

The number of bytes read. This value can be less than the number of bytes in the buffer if there is not enough bytes in the stream.

### See Also

* class [StreamContainer](../)
* namespace [Aspose.Imaging](../../streamcontainer/)
* assembly [Aspose.Imaging](../../../)

---

## Read(byte[], int, int) {#read_1}

Reads a sequence of bytes from the current stream and advances the position within the stream by the number of bytes read.

```csharp
public virtual int Read(byte[] buffer, int offset, int count)
```

| Parameter | Type | Description |
| --- | --- | --- |
| buffer | Byte[] | An array of bytes. When this method returns, the buffer contains the specified byte array with the values between *offset* and (*offset* + *count* - 1) replaced by the bytes read from the current source. |
| offset | Int32 | The zero-based byte offset in *buffer* at which to begin storing the data read from the current stream. |
| count | Int32 | The maximum number of bytes to be read from the current stream. |

### Return Value

The total number of bytes read into the buffer. This can be less than the number of bytes requested if that many bytes are not currently available, or zero (0) if the end of the stream has been reached.

### See Also

* class [StreamContainer](../)
* namespace [Aspose.Imaging](../../streamcontainer/)
* assembly [Aspose.Imaging](../../../)


