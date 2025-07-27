import React, { Component } from 'react';
import './Stylesheets/Posts.css';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = { posts: [] };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => this.setState({ posts: data }))
      .catch(err => console.error(err));
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('Error occurred: ' + error);
  }

  render() {
    return (
      <div className="posts-container">
        <h1>Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id} className="post-card">
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
