import React from "react";
import "./App.css";

const courses = [
  { name: "Angular", date: "4/5/2021" },
  { name: "React", date: "6/3/2021" },
];

const books = [
  { title: "Master React", price: 670 },
  { title: "Deep Dive into Angular 11", price: 800 },
  { title: "Mongo Essentials", price: 450 },
];

const blogs = [
  {
    title: "React Learning",
    author: "Stephen Biz",
    content: "Welcome to learning React!",
  },
  {
    title: "Installation",
    author: "Schewzdenier",
    content: "You can install React from npm.",
  },
];

function App() {
  return (
    <div className="container">
      <div className="column">
        <h2>Course Details</h2>
        {courses.map((course, idx) => (
          <div key={idx} className="item">
            <strong>{course.name}</strong>
            <p>{course.date}</p>
          </div>
        ))}
      </div>

      <div className="divider"></div>

      <div className="column">
        <h2>Book Details</h2>
        {books.map((book, idx) => (
          <div key={idx} className="item">
            <strong>{book.title}</strong>
            <p>{book.price}</p>
          </div>
        ))}
      </div>

      <div className="divider"></div>

      <div className="column">
        <h2>Blog Details</h2>
        {blogs.map((blog, idx) => (
          <div key={idx} className="item">
            <strong>{blog.title}</strong>
            <p className="author">{blog.author}</p>
            <p>{blog.content}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
