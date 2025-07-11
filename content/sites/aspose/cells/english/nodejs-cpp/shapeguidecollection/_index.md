﻿---
title: ShapeGuideCollection
second_title: Aspose.Cells for Node.js via C++ API Reference
description: Encapsulates a collection of shape guide
type: docs
url: /nodejs-cpp/shapeguidecollection/
---

## ShapeGuideCollection class

Encapsulates a collection of shape guide

```javascript
class ShapeGuideCollection;
```


## Constructors

| Constructor | Description |
| --- | --- |
| [constructor()](#constructor--)| Default Constructor. |

## Methods

| Method | Description |
| --- | --- |
| [get(number)](#get-number-)| Gets a shape guide by index |
| [add(string, number)](#add-string-number-)| Adds a shape guide.(Important: This feature is currently only available for Excel07 and above) |
| [getCount()](#getCount--)| <b>@deprecated.</b> Please use the 'count' property instead. Gets the number of elements contained in. |
| [isNull()](#isNull--)| Checks whether the implementation object is null. |


### constructor() {#constructor--}

Default Constructor.

```javascript
constructor();
```


### get(number) {#get-number-}

Gets a shape guide by index

```javascript
get(index: number) : ShapeGuide;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number |  |

**Returns**

[ShapeGuide](../shapeguide/)

### add(string, number) {#add-string-number-}

Adds a shape guide.(Important: This feature is currently only available for Excel07 and above)

```javascript
add(name: string, val: number) : number;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | string | the name of adjust. It's as "adj(Used when there is only one adjustment value)", "adj1", "adj2", "adj3" and so on. |
| val | number | the value of adjust |

### getCount() {#getCount--}

<b>@deprecated.</b> Please use the 'count' property instead. Gets the number of elements contained in.

```javascript
getCount() : number;
```


### isNull() {#isNull--}

Checks whether the implementation object is null.

```javascript
isNull() : boolean;
```



