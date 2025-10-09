---
title: BinaryDataReader Class
type: docs
weight: 10
url: /python-net/aspose.gis.common.io/binarydatareader/
---

**Summary:** 

**Module:** [aspose.gis.common.io](/psd/python-net/aspose.gis.common.io/)

**Full Name:** aspose.gis.common.io.BinaryDataReader

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| base_stream | _io.BufferedRandom | r |    |
| is_little_endian | bool | r |    |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [big_endian(input, leave_open)](#big_endian_input_leave_open_1) |    |
| [create(byte_order, input, leave_open)](#create_byte_order_input_leave_open_2) |    |
| [little_endian(input, leave_open)](#little_endian_input_leave_open_3) |    |
| [read_byte()](#read_byte__4) |    |
| [read_double()](#read_double__5) |    |
| [read_int16()](#read_int16__6) |    |
| [read_int32()](#read_int32__7) |    |
| [read_int64()](#read_int64__8) |    |
| [read_s_byte()](#read_s_byte__9) |    |
| [read_single()](#read_single__10) |    |
| [read_u_int16()](#read_u_int16__11) |    |
| [read_u_int32()](#read_u_int32__12) |    |
| [read_u_int64()](#read_u_int64__13) |    |


### Method: big_endian(input, leave_open)  [static] {#big_endian_input_leave_open_1}


```
 big_endian(input, leave_open) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| input | _io.BufferedRandom |  |
| leave_open | bool |  |

**Returns**

| Type | Description |
| :- | :- |
| [BinaryDataReader](/psd/python-net/aspose.gis.common.io/binarydatareader) |  |


### Method: create(byte_order, input, leave_open)  [static] {#create_byte_order_input_leave_open_2}


```
 create(byte_order, input, leave_open) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| byte_order | [ByteOrder](/psd/python-net/aspose.gis.common.io/byteorder) |  |
| input | _io.BufferedRandom |  |
| leave_open | bool |  |

**Returns**

| Type | Description |
| :- | :- |
| [BinaryDataReader](/psd/python-net/aspose.gis.common.io/binarydatareader) |  |


### Method: little_endian(input, leave_open)  [static] {#little_endian_input_leave_open_3}


```
 little_endian(input, leave_open) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| input | _io.BufferedRandom |  |
| leave_open | bool |  |

**Returns**

| Type | Description |
| :- | :- |
| [BinaryDataReader](/psd/python-net/aspose.gis.common.io/binarydatareader) |  |


### Method: read_byte() {#read_byte__4}


```
 read_byte() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| byte |  |


### Method: read_double() {#read_double__5}


```
 read_double() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| double |  |


### Method: read_int16() {#read_int16__6}


```
 read_int16() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| short |  |


### Method: read_int32() {#read_int32__7}


```
 read_int32() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| int |  |


### Method: read_int64() {#read_int64__8}


```
 read_int64() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| long |  |


### Method: read_s_byte() {#read_s_byte__9}


```
 read_s_byte() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| sbyte |  |


### Method: read_single() {#read_single__10}


```
 read_single() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| float |  |


### Method: read_u_int16() {#read_u_int16__11}


```
 read_u_int16() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| ushort |  |


### Method: read_u_int32() {#read_u_int32__12}


```
 read_u_int32() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| uint |  |


### Method: read_u_int64() {#read_u_int64__13}


```
 read_u_int64() 
```

  

**Returns**

| Type | Description |
| :- | :- |
| ulong |  |


