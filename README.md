# Sushi Terminology

### Table of Contents
* [Sushi Terminology](#sushi-terminology)
  * [Project Overview](#project-overview)
  * [Getting Started](#getting-started)
  * [Credits](#credits)

## Project Overview
This project is centered around design rather than a runnable program. In fact, there is nothing to
run in this project. The purpose of this design project is to simply present how different sushi
terminologies should be used in relation to one another.

### A personal backstory on why this project came to be:
When I was younger, there was a time when I was picky about the sushi I consumed. I only ate sushi
without any raw seafood. Over time, trying to differentiate between sushi with raw seafood and
sushi without raw seafood to my friends and family and at restaurants when I went out became
tiresome. Writing the entire thing out here is even tiresome - such a lengthy phrase for such a
simple idea.

But nowadays, I do in fact eat both types of sushi - but that isn't the point here. The point is
that on April 1 of 2023 at approximately 2 in the morning, I got tired of verbally spelling out
sushi without raw seafood and sushi with raw seafood, so I coined the term, "*sushami*", to define
a type of sushi that consisted of raw seafood. Some months later on December 12 of 2023 at
approximately 10 at night, I coined a new term for the exact opposite of sushami. Sushi that does
not consist of raw seafood would be referred to as "*nogiri*".

As one can imagine, there was quite a bit of bewilderment among my colleagues. They began mixing
terms such as "sushi", "sashimi", "sushami", "nigiri", and "nogiri" together, and started asking me
what is "sushi" and what isn't. Hence, I decided to build a project dedicated to clearing up any
confusion on the numerous sushi terminologies for my friends and anyone else who may have trouble
properly grasping the definition of the two new sushi terminologies I coined.

[Back to the top](#sushi-terminology)

## Getting Started
Since this is a design project, there is no program to run. In order to get started and understand
what's happening, it's best to understand the overall design of the project. The project is divided
into three packages: <span style="color:SlateBlue">**ingredients**</span>,
<span style="color:SlateBlue">**sashimi**</span>, and
<span style="color:SlateBlue">**sushi**</span>. The <span style="color:SlateBlue">**sushi**</span>
package holds all the classes/interfaces directly related to the design of sushi in general. The
<span style="color:SlateBlue">**ingredients**</span> package holds any classes/interfaces that
represent the ingredients of sushi. It is simply support for the classes/interfaces in
<span style="color:SlateBlue">**sushi**</span>. The
<span style="color:SlateBlue">**sashimi**</span> package simply exists to specially represent
sashimi, a dish commonly confused with sushi itself. In order to define sushi, it was necessary to
define what really shouldn't be called "sushi" as well. Hence, the reason this package exists.

Now that we've broken the packages down, let's move onto where to get started in understanding
this whole project. Start with the <span style="color:Tomato">**Sushi**</span> interface located in
the <span style="color:SlateBlue">**sushi**</span> package to gain an understanding on what sushi
is along with its behaviors. Next, check out the
<span style="color:SlateBlue">**ingredients**</span> package starting with the
<span style="color:Tomato">**Ingredient**</span> interface before moving on to its implementation
classes in no particular order. Afterwards, you may move onto the
<span style="color:Tomato">**Sashimi**</span> class in the
<span style="color:SlateBlue">**sashimi**</span> package.

All that's left now are the remaining <span style="color:Tomato">**Sushi**</span> implementation
classes. It's recommended to check them out in the following order for a detailed understanding of
all classes: <span style="color:Aqua">**Nigiri**</span>,
<span style="color:Aqua">**MakiRoll**</span>, <span style="color:Aqua">**Sushami**</span>, and
<span style="color:Aqua">**NogiriRoll**</span>.

After you take a look at all entities in the project, you may want to finally take a look at the
<span style="color:Orange">**SushiDiagram.png**</span> file, which gives a complete visual UML
diagram of the whole project.

And that's all folks! Happy reading and happy holiday!

[Back to the top](#sushi-terminology)


## Credits
This project was created by Justin Kim of *Northeastern University*.

[Back to the top](#sushi-terminology)