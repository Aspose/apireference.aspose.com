---
title: License
second_title: Aspose.3D for Java API Reference
description: Provides methods to license the component.
type: docs
weight: 83
url: /java/com.aspose.threed/license/
---

**Inheritance:**
java.lang.Object
```
public class License
```

Provides methods to license the component.
## Constructors

| Constructor | Description |
| --- | --- |
| [License()](#License--) | Initializes a new instance of this class. |
## Methods

| Method | Description |
| --- | --- |
| [isLicenseSet()](#isLicenseSet--) | Checks whether valid license has been set. |
| [getSubscriptionExpireDate()](#getSubscriptionExpireDate--) | Gets the last date of the subscription. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Licenses the component. |
| [setLicense(String licenseFileName)](#setLicense-java.lang.String-) |  |
| [setLicense(Reader reader)](#setLicense-java.io.Reader-) | Licenses the component. |
### License() {#License--}
```
public License()
```


Initializes a new instance of this class.

### isLicenseSet() {#isLicenseSet--}
```
public static boolean isLicenseSet()
```


Checks whether valid license has been set.

**Returns:**
boolean - true if valid license has been set.
### getSubscriptionExpireDate() {#getSubscriptionExpireDate--}
```
public static Date getSubscriptionExpireDate()
```


Gets the last date of the subscription.

**Returns:**
java.util.Date - the last date of the subscription.
### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


Licenses the component.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | A stream that contains the license. Use null to switch to evaluation mode. |

### setLicense(String licenseFileName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseFileName)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| licenseFileName | java.lang.String |  |

### setLicense(Reader reader) {#setLicense-java.io.Reader-}
```
public void setLicense(Reader reader)
```


Licenses the component.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| reader | java.io.Reader | A reader that contains the license. Use null to switch to evaluation mode. |

