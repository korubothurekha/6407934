import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState("book");

  // if-else method
  let component;
  if (view === "book") {
    component = <BookDetails />;
  } else if (view === "blog") {
    component = <BlogDetails />;
  } else {
    component = <CourseDetails />;
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>📰 Blogger App</h1>

      <div>
        <button onClick={() => setView("book")}>Show Book</button>
        <button onClick={() => setView("blog")}>Show Blog</button>
        <button onClick={() => setView("course")}>Show Course</button>
      </div>

      <hr />

      {/* 1. if-else */}
      {component}

      {/* 2. Ternary Operator */}
      {/* {view === "book" ? <BookDetails /> : <BlogDetails />} */}

      {/* 3. Logical AND */}
      {/* {view === "book" && <BookDetails />}
      {view === "blog" && <BlogDetails />}
      {view === "course" && <CourseDetails />} */}

      {/* 4. Simulated Switch */}
      {/* switch(view) not supported, use object map */}
      {/* {{
        book: <BookDetails />,
        blog: <BlogDetails />,
        course: <CourseDetails />
      }[view]} */}
    </div>
  );
}

export default App;
