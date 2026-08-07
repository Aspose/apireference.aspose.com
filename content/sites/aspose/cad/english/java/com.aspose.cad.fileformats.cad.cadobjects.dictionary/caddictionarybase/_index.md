---
title: "CadDictionaryBase"
linktitle: "CadDictionaryBase"
second_title: "Aspose.CAD for Java"
description: "Class describing DICTIONARY base object."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/
---

**Inheritance:** java.lang.Object, CadBaseObject

Class describing DICTIONARY base object.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadDictionaryBase()](#CadDictionaryBase) | Initializes a new instance of the CadDictionaryBase class. |

## Methods

| Method | Description |
| --- | --- |
| [getHardOwnerFlag()](#getHardOwnerFlag) | Gets or sets hard owner flag. |
| [setHardOwnerFlag(short value)](#setHardOwnerFlag-short) | Gets or sets hard owner flag. |
| [getCloningFlag()](#getCloningFlag) | Gets or sets cloning flag. |
| [setCloningFlag(short value)](#setCloningFlag-short) | Gets or sets cloning flag. |
| [getEntryNames()](#getEntryNames) | Gets or sets names of entries. |
| [setEntryNames(List<String> value)](#setEntryNames-java.util.List) | Gets or sets names of entries. |
| [getEntrySoftOwners()](#getEntrySoftOwners) | Gets or sets the entry soft owners. |
| [setEntrySoftOwners(List<com.aspose.ms.System.Collections.Generic.KeyValuePair<Integer,String>> value)](#setEntrySoftOwners-java.util.List) | Gets or sets the entry soft owners. |
| [get_Item(String key)](#get_Item-java.lang.String) | Gets or sets the entry soft owner by key. |
| [tryGetValue(String key, String[] value)](#tryGetValue-java.lang.String-java.lang.String:A) | Gets the entry soft owner by key. |
| [tryGetValue(String key, int[] attr, String[] value)](#tryGetValue-java.lang.String-int:A-java.lang.String:A) | Gets the entry soft owner by key. |
| [removeByValue(String value)](#removeByValue-java.lang.String) | Removes the entry soft owner and entry name by value. |

### CadDictionaryBase() {#CadDictionaryBase}
```java
public CadDictionaryBase()
```

Initializes a new instance of the CadDictionaryBase class.

### getHardOwnerFlag() {#getHardOwnerFlag}
```java
public final short getHardOwnerFlag()
```

Gets or sets hard owner flag.

**Returns:** short

### setHardOwnerFlag(short value) {#setHardOwnerFlag-short}
```java
public final void setHardOwnerFlag(short value)
```

Gets or sets hard owner flag.

### getCloningFlag() {#getCloningFlag}
```java
public final short getCloningFlag()
```

Gets or sets cloning flag.

**Returns:** short

### setCloningFlag(short value) {#setCloningFlag-short}
```java
public final void setCloningFlag(short value)
```

Gets or sets cloning flag.

### getEntryNames() {#getEntryNames}
```java
public final List<String> getEntryNames()
```

Gets or sets names of entries.

**Returns:** List<String>

### setEntryNames(List<String> value) {#setEntryNames-java.util.List}
```java
public final void setEntryNames(List<String> value)
```

Gets or sets names of entries.

### getEntrySoftOwners() {#getEntrySoftOwners}
```java
public final List<com.aspose.ms.System.Collections.Generic.KeyValuePair<Integer,String>> getEntrySoftOwners()
```

Gets or sets the entry soft owners.

**Returns:** List<com.aspose.ms.System.Collections.Generic.KeyValuePair<Integer,String>> - The entry soft owners.

### setEntrySoftOwners(List<com.aspose.ms.System.Collections.Generic.KeyValuePair<Integer,String>> value) {#setEntrySoftOwners-java.util.List}
```java
public final void setEntrySoftOwners(List<com.aspose.ms.System.Collections.Generic.KeyValuePair<Integer,String>> value)
```

Gets or sets the entry soft owners.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<com.aspose.ms.System.Collections.Generic.KeyValuePair<Integer | The entry soft owners. |

### get_Item(String key) {#get_Item-java.lang.String}
```java
public final String get_Item(String key)
```

Gets or sets the entry soft owner by key.

**Returns:** String - The entry soft owners.

### tryGetValue(String key, String[] value) {#tryGetValue-java.lang.String-java.lang.String:A}
```java
public final boolean tryGetValue(String key, String[] value)
```

Gets the entry soft owner by key.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The key. |
| value | String[] | The parameter. |

**Returns:** boolean - true if dictionary contains the key otherwise false

### tryGetValue(String key, int[] attr, String[] value) {#tryGetValue-java.lang.String-int:A-java.lang.String:A}
```java
public final boolean tryGetValue(String key, int[] attr, String[] value)
```

Gets the entry soft owner by key.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The key. |
| attr | int[] | The attribute. |
| value | String[] | The parameter. |

**Returns:** boolean - true if dictionary contains the key otherwise false

### removeByValue(String value) {#removeByValue-java.lang.String}
```java
public final void removeByValue(String value)
```

Removes the entry soft owner and entry name by value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The value. |

