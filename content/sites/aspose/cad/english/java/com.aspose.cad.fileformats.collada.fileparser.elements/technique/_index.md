---
title: "Technique"
linktitle: "Technique"
second_title: "Aspose.CAD for Java"
description: "The technique."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/technique/
---

**Inheritance:** java.lang.Object, ColladaElement

The technique. The technique element declares the information used to process some portion of the content. Each technique conforms to an associated profile.Techniques generally act as a "switch". If more than one is present for a particular portion of content, on import, one or the other is picked, but usually not both. Selection should be based on which profile the importing application can support. Techniques contain application data and programs, making them assets that can be managed as a unit.

## Constructors

| Constructor | Description |
| --- | --- |
| [Technique()](#Technique) |  |

## Methods

| Method | Description |
| --- | --- |
| [getProfile()](#getProfile) | Gets or sets the profile. The profile attribute indicates the type of profile. This is a vendor defined character string that indicates the platform or capability target for the technique. Required attribute. |
| [setProfile(String value)](#setProfile-java.lang.String) | Gets or sets the profile. The profile attribute indicates the type of profile. This is a vendor defined character string that indicates the platform or capability target for the technique. Required attribute. |
| [getAny()](#getAny) | Gets or sets the any elements. |
| [setAny(com.aspose.ms.System.Xml.XmlElement[] value)](#setAny-com.aspose.ms.System.Xml.XmlElement:A) | Gets or sets the any elements. |

### Technique() {#Technique}
```java
public Technique()
```

### getProfile() {#getProfile}
```java
public final String getProfile()
```

Gets or sets the profile. The profile attribute indicates the type of profile. This is a vendor defined character string that indicates the platform or capability target for the technique. Required attribute.

**Returns:** String

### setProfile(String value) {#setProfile-java.lang.String}
```java
public final void setProfile(String value)
```

Gets or sets the profile. The profile attribute indicates the type of profile. This is a vendor defined character string that indicates the platform or capability target for the technique. Required attribute.

### getAny() {#getAny}
```java
public final com.aspose.ms.System.Xml.XmlElement[] getAny()
```

Gets or sets the any elements.

**Returns:** com.aspose.ms.System.Xml.XmlElement[]

### setAny(com.aspose.ms.System.Xml.XmlElement[] value) {#setAny-com.aspose.ms.System.Xml.XmlElement:A}
```java
public final void setAny(com.aspose.ms.System.Xml.XmlElement[] value)
```

Gets or sets the any elements.

